package com.example.lifeteer_ex1.A_StartPage

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import androidx.core.content.ContextCompat
import com.example.lifeteer_ex1.R
import com.example.lifeteer_ex1.databinding.ActivitySplashPageBinding

class SplashPage : AppCompatActivity() {
    private lateinit var binding: ActivitySplashPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(
            this, R.color.mindset_main_background)
        binding = ActivitySplashPageBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}