package com.webroot.library


//import platform.UIKit.UIDevice

actual class Platform actual constructor() {
    actual val platform: String = "ios" //UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}