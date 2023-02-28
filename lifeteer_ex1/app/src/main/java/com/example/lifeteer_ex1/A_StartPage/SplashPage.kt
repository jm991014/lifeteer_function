package com.example.lifeteer_ex1.A_StartPage

import android.app.Activity
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
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
            this, R.color.mindset_main_background) //status bar를 background 색과 맞춰줌.

        binding = ActivitySplashPageBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        Handler(Looper.getMainLooper()).postDelayed({

            val intent = Intent(this, LandingPage::class.java)
            startActivity(intent)

            finish() // 이전 키를 눌렀을 때를 방지하기 위한 finish
        }, 2000) //2초 이후 실행
    }
}