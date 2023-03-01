package com.example.lifeteer_ex1.A_Start

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lifeteer_ex1.databinding.ActivityLandingPageBinding

class LandingPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLandingPageBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}