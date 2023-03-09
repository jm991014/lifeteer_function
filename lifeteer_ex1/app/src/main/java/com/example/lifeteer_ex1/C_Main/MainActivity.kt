package com.example.lifeteer_ex1.C_Main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.lifeteer_ex1.R
import com.example.lifeteer_ex1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        replaceFragment(FragmentMindset())

        binding.bnvMain.setOnItemSelectedListener { MenuItem ->
            when (MenuItem.itemId) {
                R.id.mindset -> replaceFragment(FragmentMindset())
                R.id.diary -> replaceFragment(FragmentDiary())
                R.id.recorded -> replaceFragment(FragmentRecorded())
                R.id.mypage -> replaceFragment(FragmentMypage())
            }
            true
        }    }

    private fun replaceFragment(fragment: Fragment) {
        Log.d("MainActivity", "${fragment}")
        supportFragmentManager.beginTransaction()
            .apply {
                replace(R.id.frame_main, fragment)
                commit()
            }
    }
}