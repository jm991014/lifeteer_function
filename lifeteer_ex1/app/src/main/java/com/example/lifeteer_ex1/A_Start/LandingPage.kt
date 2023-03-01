package com.example.lifeteer_ex1.A_Start

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lifeteer_ex1.databinding.ActivityLandingPageBinding

class LandingPage : AppCompatActivity() {
    val binding by lazy {ActivityLandingPageBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val intent = Intent(this, LandingViewPage::class.java)
        binding.btnKnow.setOnClickListener{startActivity(intent)}
    }
}