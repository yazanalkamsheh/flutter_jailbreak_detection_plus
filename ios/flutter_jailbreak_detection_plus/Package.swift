// swift-tools-version: 5.9
// The swift-tools-version declares the minimum version of Swift required to build this package.

import PackageDescription

let package = Package(
  name: "flutter_jailbreak_detection_plus",
  platforms: [
    .iOS("11.0")
  ],
  products: [
    .library(name: "flutter-jailbreak-detection-plus", targets: ["flutter_jailbreak_detection_plus"])
  ],
  dependencies: [
    .package(url: "https://github.com/securing/IOSSecuritySuite.git", from: "2.2.0")
  ],
  targets: [
    .target(
      name: "flutter_jailbreak_detection_plus",
      dependencies: [
        .product(name: "IOSSecuritySuite", package: "IOSSecuritySuite")
      ]
    )
  ]
)
