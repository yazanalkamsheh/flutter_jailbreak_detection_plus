#
# To learn more about a Podspec see http://guides.cocoapods.org/syntax/podspec.html
#
Pod::Spec.new do |s|
  s.name             = 'flutter_jailbreak_detection_plus'
  s.version          = '1.10.5'
  s.summary          = 'Flutter jailbreak and root detection plugin'
  s.description      = <<-DESC
Flutter jailbreak and root detection plugin
                       DESC
  s.homepage         = 'https://github.com/yazanalkamsheh/flutter_jailbreak_detection_plus.git'
  s.license          = { :file => '../LICENSE' }
  s.author           = { 'Yazan Al-Kamsheh' => 'yazan.alkamsheh2@gmail.com' }
  s.source           = { :path => '.' }
  s.source_files = 'Classes/**/*'
  s.public_header_files = 'Classes/**/*.h'
  s.dependency 'Flutter'
  s.dependency 'IOSSecuritySuite'
  

  s.ios.deployment_target = '10.0'
end

