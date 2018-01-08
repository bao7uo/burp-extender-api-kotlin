# Burp Extender API - Kotlin version

This repository holds the [Burp Suite Pro Extender API](https://portswigger.net/burp/extender/)
for building user extensions ([BApps](https://portswigger.net/bappstore/))
leveraging the core functionality of Burp.

## Origin

These source code files were converted from the Portswigger Java files using IntelliJ's convert Java file to Kotlin file feature. The files are provided here for those who prefer not to use IntelliJ. A slight tweak was required to the Portswigger files to allow a smooth conversion. See this commit for details https://github.com/bao7uo/burp-extender-api/commit/d58ef77a5fa2e11feddfd6ffa0b3ed6a8747b4b8 for precise details.

## Build

Build with:

`kotlinc src/main/kotlin/burp/*.kt -d burp-extender-api-kotlin.jar`

Then build your plugin with:

`kotlinc -cp burp-extender-api-kotlin.jar your_plugin*.kt -d your_plugin.jar`

Alternatively you can just build your plugin by including the source files. See build details in README of https://github.com/bao7uo/TargetLockOn for details.
