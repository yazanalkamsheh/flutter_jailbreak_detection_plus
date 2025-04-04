# flutter_jailbreak_detection

Flutter jailbreak and root detection plugin.

It uses [RootBeer](https://github.com/scottyab/rootbeer) on Android,
and [IOSSecuritySuite](https://github.com/securing/IOSSecuritySuite) on iOS.

## Getting Started

```
import 'package:flutter_jailbreak_detection_plus/flutter_jailbreak_detection_plus.dart';

bool jailbroken = await FlutterJailbreakDetectionPlus.jailbroken;
bool developerMode = await FlutterJailbreakDetectionPlus.developerMode; // android only.

```
