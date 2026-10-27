## [1.10.8] - 2026-10-27
### Added
- Swift Package Manager support for iOS. Thanks to @TeddyYeung for the PR.
- README: requirements and a platform comparison table.

### Changed
- **Android:** `minSdk` raised from 17 to 21 (the minimum supported by Flutter).
- **Android:** RootBeer checks now run on a background thread instead of the main thread.
- **Android:** the developer-options check reads `Settings.Global`.
- **Android:** set Kotlin `jvmTarget` to 17. Thanks to @pintusingh28 for the PR.
- Minimum Flutter version is now 3.27.0 (matching the existing Dart `>=3.6.2` constraint).

### Fixed
- Corrected the package description (iOS uses IOSSecuritySuite) and removed the invalid `maintainer` field.
- Synced the podspec version with `pubspec.yaml`.

### Notes
- `developerMode` is not equivalent across platforms: on iOS it returns whether the app runs in a simulator.

## [1.10.7] - 2025-10-29
### Fixed
- Android 16KB page size compatibility (libtoolChecker.so)
- RootBeer dependency update to 0.1.1
- Updated Gradle, Kotlin, and build configuration


## [1.10.6]
- Fixed: Jailbreak detection issue on iOS.
- Thanks to @azizsoule for the PR.

- ## [1.10.4] - 2025-04-04
- Add namespace

## 1.10.1

* Updates and Improvements
* Fixed minor bugs
* Improved library performance

Upgraded Dart version

## 1.8.0

* Upgrade android embedding
  Thanks https://github.com/xPutnikx for the PR.
  
* Fixed header issue
  Thanks https://github.com/cr0manty for the PR.

## 1.7.0

* Upgrade rootbeer to 0.0.10
Thanks https://github.com/patuoynageek for the PR.

## 1.6.0

* Upgrade rootbeer to 0.0.9

## 1.5.0
Upgrade to kotlin 1.3.30. Thanks https://github.com/kmoorejr9 for the PR.
Support for null safety.  Thanks https://github.com/tvh for the PR.
Rootbeer dependency fix. Thanks https://github.com/benoitskipr for the PR.

## 1.4.0

* Change some formatting, move package to appmire publisher.

## 1.3.0

* Update rootbeer dependency url. Thanks https://github.com/sckoh for the PR.

## 1.2.0

* Upgrade rootbeer plugin. Thanks https://github.com/zaralockheart for the PR.

## 1.1.0

* Prevent plugin initialization when Activity is not available

## 1.0.0

* Upgrade gradle plugin and support for AndroidX

