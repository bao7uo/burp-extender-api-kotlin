# Burp Extender API - Unofficial Kotlin version
[![Language](https://img.shields.io/badge/Lang-Kotlin-blue.svg)](https://kotlinlang.org)

Unofficial Kotlin version of the [Burp Suite Pro Extender API](https://portswigger.net/burp/extender/)
for building user extensions ([BApps](https://portswigger.net/bappstore/))
leveraging the core functionality of Burp.

## Purpose

The Kotlin version of the API allows Burp extensions to be written entirely in Kotlin.

## Origin

These source code files were converted from the Portswigger Java files using IntelliJ's convert Java file to Kotlin file feature. The files are provided here for those who prefer not to use IntelliJ. A slight tweak was required to the Portswigger files to allow a smooth conversion. See the following commit for precise details:
- https://github.com/bao7uo/burp-extender-api/commit/d58ef77a5fa2e11feddfd6ffa0b3ed6a8747b4b8

## Update

Alterations to the IntelliJ converted files are required for constants in companion objects to be accessible when loading extensions into Burp

For example, the included test file `burp-kotlin-test-interface-constants.kt` will work as a standalone Jar, but will produce an error `java.lang.NoSuchFieldError: Companion` when loading into Burp, unless `const` is prefixed to the constants declared in the relevant companion objects. E.g.
```Kotlin
    companion object {
        /**
         * This action causes Burp Proxy to follow the current interception rules to
         * determine the appropriate action to take for the message.
         */
        const val ACTION_FOLLOW_RULES = 0
```
The necessary alterations have been pushed to this repo.

To be able to run the test file as a standalone Jar (outside Burp) you will need to include the API as source files when building, rather than a class path (see `build` file for details).

## Build

Build the Kotlin API with:

`kotlinc src/main/kotlin/burp/*.kt -d burp-extender-api-kotlin.jar`

Then build your plugin with:

`kotlinc -include-runtime -cp burp-extender-api-kotlin.jar your_plugin*.kt -d your_plugin.jar`

Alternatively you can build the api and plugin simultaneously. See build instructions in the README of the following project:
- https://github.com/bao7uo/target-redirector
