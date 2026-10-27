package yazan.alkamsheh.flutterjailbreakdetectionplus

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.provider.Settings
import com.scottyab.rootbeer.RootBeer

import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.Result
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.embedding.engine.plugins.FlutterPlugin
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors



class FlutterJailbreakDetectionPlugin : FlutterPlugin, MethodCallHandler {
    private lateinit var context: Context
    private lateinit var channel: MethodChannel
    private var executor: ExecutorService? = null
    private val mainHandler = Handler(Looper.getMainLooper())


    override fun onAttachedToEngine(binding: FlutterPluginBinding) {
        channel = MethodChannel(binding.binaryMessenger, "flutter_jailbreak_detection")
        context = binding.applicationContext
        executor = Executors.newSingleThreadExecutor()
        channel.setMethodCallHandler(this)
    }


    override fun onDetachedFromEngine(binding: FlutterPluginBinding) {
        channel.setMethodCallHandler(null)
        executor?.shutdown()
        executor = null
    }


    private fun isDevMode(): Boolean {
        return Settings.Global.getInt(
            context.contentResolver,
            Settings.Global.DEVELOPMENT_SETTINGS_ENABLED, 0
        ) != 0
    }


    override fun onMethodCall(call: MethodCall, result: Result): Unit {
        when (call.method) {
            "jailbroken" -> runInBackground(result) { RootBeer(context).isRooted }
            "developerMode" -> result.success(isDevMode())
            else -> result.notImplemented()
        }
    }


    // RootBeer inspects files and runs commands, so keep it off the main thread.
    private fun runInBackground(result: Result, check: () -> Boolean) {
        val service = executor
        if (service == null) {
            result.error("unavailable", "Plugin is detached from the engine", null)
            return
        }
        service.execute {
            try {
                val value = check()
                mainHandler.post { result.success(value) }
            } catch (e: Exception) {
                mainHandler.post { result.error("error", e.message, null) }
            }
        }
    }


}
