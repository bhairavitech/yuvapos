package com.example.yuvapos

import android.os.Bundle
import io.flutter.embedding.android.FlutterActivity
import io.flutter.plugins.imagepicker.ImagePickerPlugin
import com.tekartik.sqflite.SqflitePlugin
import io.flutter.plugins.GeneratedPluginRegistrant


class MainActivity : FlutterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ImagePickerPlugin.registerWith(
                registrarFor("io.flutter.plugins.imagepicker.ImagePickerPlugin"))
        SqflitePlugin.registerWith(registrarFor("com.tekartik.sqflite.SqflitePlugin"))
        GeneratedPluginRegistrant.registerWith(this)
    }

}
