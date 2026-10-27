# flutter_jailbreak_detection_plus

Flutter jailbreak and root detection plugin.

It uses [RootBeer](https://github.com/scottyab/rootbeer) on Android,
and [IOSSecuritySuite](https://github.com/securing/IOSSecuritySuite) on iOS.

## Requirements

- Flutter 3.27 or newer (Dart 3.6.2+)
- Android: minSdk 21+
- iOS: 10.0+ with CocoaPods, 11.0+ with Swift Package Manager

## Getting Started

```dart
import 'package:flutter_jailbreak_detection_plus/flutter_jailbreak_detection_plus.dart';

bool jailbroken = await FlutterJailbreakDetectionPlus.jailbroken;
bool developerMode = await FlutterJailbreakDetectionPlus.developerMode;
```

## API

| Getter | Android | iOS |
| --- | --- | --- |
| `jailbroken` | `true` if the device is rooted (RootBeer) | `true` if the device is jailbroken (IOSSecuritySuite) |
| `developerMode` | `true` if Developer options are enabled | `true` if the app runs in a simulator (not a developer-mode check) |

Both getters return `true` (fail closed) if the platform returns no value.
They may throw a `PlatformException`, so wrap them in a `try/catch` if you need
to handle failures yourself.

> **Note:** `developerMode` is not equivalent across platforms. Do not rely on
> it to detect iOS developer mode.
