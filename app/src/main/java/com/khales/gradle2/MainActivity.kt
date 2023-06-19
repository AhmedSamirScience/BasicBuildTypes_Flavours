package com.khales.gradle2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        if(BuildConfig.BUILD_TYPE == "debug")
//        {
//                Toast.makeText(this,"Welcome to debug Version",Toast.LENGTH_SHORT).show()
//        }
//        if(BuildConfig.BUILD_TYPE == "release")
//        {
//                Toast.makeText(this,"Welcome to release Version",Toast.LENGTH_SHORT).show()
//        }

//        if(BuildConfig.FLAVOR == "free")
//        {
//                Toast.makeText(this,"Welcome to release Version",Toast.LENGTH_SHORT).show()
//        }
//        if(BuildConfig.FLAVOR == "pro")
//        {
//            Toast.makeText(this,"Welcome to release Version",Toast.LENGTH_SHORT).show()
//        }

    }
}