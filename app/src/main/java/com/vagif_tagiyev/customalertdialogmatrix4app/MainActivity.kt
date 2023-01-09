package com.vagif_tagiyev.customalertdialogmatrix4app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vagif_tagiyev.customalertdialogmatrix4app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
    }
}