package com.example.lifeteer_ex1.A_Start

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.lifeteer_ex1.LandingFragmentA
import com.example.lifeteer_ex1.LandingFragmentB
import com.example.lifeteer_ex1.LandingFragmentC
import com.example.lifeteer_ex1.databinding.ActivityLandingViewPageBinding

class LandingViewPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityLandingViewPageBinding.inflate(layoutInflater)
        // val binding으로 하는것과 lazy나 latinent를 사용해서 하는 것의 차이는?
        // 1. 페이지 데이터 로드
        val list = listOf(LandingFragmentA(), LandingFragmentB(), LandingFragmentC(), LandingFragmentD())
        // 2. adaptor 생성
        val pagerAdapter = FragmentPagerAdapter(list, this)
        // 3. adapter & viewpager 연결
        binding.viewPager.adapter = pagerAdapter
        setContentView(binding.root)


    }
}

class FragmentPagerAdapter(val fragmentList:List<Fragment>, fragmentActivity: FragmentActivity)
    : FragmentStateAdapter(fragmentActivity){

    override fun getItemCount() = fragmentList.size
    override fun createFragment(position: Int) = fragmentList.get(position)
}