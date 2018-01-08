# Burp Extender API - Unofficial Kotlin version

Unofficial Kotlin version of the [Burp Suite Pro Extender API](https://portswigger.net/burp/extender/)
for building user extensions ([BApps](https://portswigger.net/bappstore/))
leveraging the core functionality of Burp.

## Purpose

The Kotlin version of the API allows Burp extensions to be written entirely in Kotlin.

## Origin

These source code files were converted from the Portswigger Java files using IntelliJ's convert Java file to Kotlin file feature. The files are provided here for those who prefer not to use IntelliJ. A slight tweak was required to the Portswigger files to allow a smooth conversion. See the following commit for precise details:
- https://github.com/bao7uo/burp-extender-api/commit/d58ef77a5fa2e11feddfd6ffa0b3ed6a8747b4b8

## Build

Build with:

`kotlinc src/main/kotlin/burp/*.kt -d burp-extender-api-kotlin.jar`

Then build your plugin with:

`kotlinc -cp burp-extender-api-kotlin.jar your_plugin*.kt -d your_plugin.jar`

Alternatively you can build the api and plugin simultaneously. See build instructions in the README of the following project:
- https://github.com/bao7uo/TargetLockOn
