package com.example.lifeteer_ex1.LandingPage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.lifeteer_ex1.LandingFragmentA
import com.example.lifeteer_ex1.LandingFragmentB
import com.example.lifeteer_ex1.LandingFragmentC
import com.example.lifeteer_ex1.databinding.ActivityMainBinding

class LandingPage : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // 1. 페이지 데이터 로드
        val list = listOf(LandingFragmentA(), LandingFragmentB(), LandingFragmentC())
        // 2. adaptor 생성
        val pagerAdapter = FragmentPagerAdapter(list, this)
        // 3. adapter & viewpager 연결
        binding.
    }
}

class FragmentPagerAdapter(val fragmentList:List<Fragment>, fragmentActivity: FragmentActivity)
    : FragmentStateAdapter(fragmentActivity){

    override fun getItemCount() = fragmentList.size
    override fun createFragment(position: Int) = fragmentList.get(position)
}