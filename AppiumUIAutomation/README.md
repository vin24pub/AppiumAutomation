# About Framework
> POM Based structure.
> Reporting tools.
> Support for testng and Cucumber.

# Test-case file
> test case file InfiTestcase.xlsx in src/main/resources

### TestRunning in Distributed Way
> to test in distributed way use RUNNER=distribute in config.properties

### TestRunning in parallel Way
> to test in distributed way use RUNNER=parallel in config.properties

### Testing APK files 
> apk should be in debugging mode.
> Platform=android mvn clean -Dtest=Runner test
> APP_TYPE=NA
> set the path value of 'app' for debug apk in caps/capabilities.json. 
> attach adroid devices or use genymotion and check with adb devices.

### Testing ios ipa files
> ipa should be in debugging mode.
> Platform=ios mvn clean -Dtest=Runner test
> APP_TYPE=NA

### Use Platform=both mvn clean -Dtest=Runner test 

### Testing mobile web 
> to run mobile web please set parameters in config.properties
  * BROWSER_TYPE=browser/chrome
  * APP_TYPE=web 
  * Platform=android/ios/both mvn clean -Dtest=RunnerWeb test

### Switch framework 
> change parameter FRAMEWORK=testng/cucumber

## [Prerequisites]
 > adb should be installed please verify with 'adb devices' to show all attached android devices.
 > sdk should be greater that 16.
 > install appium from https://www.npmjs.com/package/appium 
 > verify with appium doctor using 'appium-doctor' command to check appium status. 
 > ANDROID_HOME and JAVA_HOME should be set in system path.
 > set ANDROID_HOME/tools and ANDROID_HOME/platform-tools in system PATH variable.
 > check mvn is install and verify version with mvn -version
 > JDK should be 1.8 
 
 
### Reports

Your should see report file generated as ExtentReport.html under the target folder.

