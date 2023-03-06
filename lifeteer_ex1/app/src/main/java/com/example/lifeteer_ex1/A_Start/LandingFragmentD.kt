package com.example.lifeteer_ex1.A_Start

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lifeteer_ex1.R
import com.example.lifeteer_ex1.databinding.ActivityLoginBinding
import com.example.lifeteer_ex1.databinding.ActivityMainBinding
import com.example.lifeteer_ex1.databinding.FragmentLandingDBinding

class LandingFragmentD : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

    return inflater.inflate(R.layout.fragment_landing_d, container, false)

    }


//    val binding by lazy {FragmentLandingDBinding.inflate(layoutInflater)}
//    binding.btnStart.setOnClickListener {
//
//    }



}