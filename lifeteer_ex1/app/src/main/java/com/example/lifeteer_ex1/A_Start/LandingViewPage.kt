package com.example.lifeteer_ex1.A_Start

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

import com.example.lifeteer_ex1.databinding.ActivityLandingViewPageBinding
import com.example.lifeteer_ex1.databinding.FragmentLandingDBinding

class LandingViewPage : AppCompatActivity() {

    val binding by lazy {ActivityLandingViewPageBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 1. 페이지 데이터 로드
        val list = listOf(LandingFragmentA(), LandingFragmentB(), LandingFragmentC(), LandingFragmentD())
        // 2. adaptor 생성
        val pagerAdapter = FragmentPagerAdapter(list, this)
        // 3. adapter & viewpager 연결
        binding.viewPager.adapter = pagerAdapter
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            startActivity(Intent(this, LandingPage::class.java))
        }
        //뒤로가기 버튼 입력 시, 랜딩페이지 0번째 페이지로 이동
    }
}
class FragmentPagerAdapter(val fragmentList:List<Fragment>, fragmentActivity: FragmentActivity)
    : FragmentStateAdapter(fragmentActivity){

    override fun getItemCount() = fragmentList.size
    override fun createFragment(position: Int) = fragmentList[position]
}
