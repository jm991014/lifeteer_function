package com.example.lifeteer_ex1.A_Start

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.lifeteer_ex1.LandingFragmentA
import com.example.lifeteer_ex1.LandingFragmentB
import com.example.lifeteer_ex1.LandingFragmentC
import com.example.lifeteer_ex1.databinding.ActivityLandingViewPageBinding
import com.example.lifeteer_ex1.databinding.ActivityLoginBinding
import com.example.lifeteer_ex1.databinding.ActivityMainBinding
import com.example.lifeteer_ex1.databinding.FragmentLandingDBinding

class LandingViewPage : AppCompatActivity() {

    val binding by lazy {ActivityLandingViewPageBinding.inflate(layoutInflater)}
    val binding2 by lazy {FragmentLandingDBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 1. 페이지 데이터 로드
        val list = listOf(LandingFragmentA(), LandingFragmentB(), LandingFragmentC(), LandingFragmentD())
        // 2. adaptor 생성
        val pagerAdapter = FragmentPagerAdapter(list, this)
        // 3. adapter & viewpager 연결
        binding.viewPager.adapter = pagerAdapter
        setContentView(binding.root)

        val intent = Intent(this, LandingPage::class.java)
        binding.btnBack.setOnClickListener {startActivity(intent)}
        //뒤로가기 버튼 입력 시, 랜딩페이지 0번째 페이지로 이동



        val intent2 = Intent(this, ActivityMainBinding::class.java)
        binding2.fragDBtnStart.setOnClickListener{startActivity(intent2)}
        //Fragment에 있는 마음짓기 시작하기 버튼으로 다음 액티비티로 넘어가야 하는데 이부분에서 문제가 계속 생김

    }
}
class FragmentPagerAdapter(val fragmentList:List<Fragment>, fragmentActivity: FragmentActivity)
    : FragmentStateAdapter(fragmentActivity){

    override fun getItemCount() = fragmentList.size
    override fun createFragment(position: Int) = fragmentList.get(position)
}