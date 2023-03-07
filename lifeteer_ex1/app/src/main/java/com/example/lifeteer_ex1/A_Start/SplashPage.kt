package com.example.lifeteer_ex1.A_Start

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
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
        setContentView(binding.root)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, LandingPage::class.java))
            finish() // 이전 키를 눌렀을 때를 방지하기 위한 finish
        }, 2000) //2초 이후 실행
    }


    //앱 최초 실행 시 다음부터는 랜딩페이지가 나오지 않게 만들기
}