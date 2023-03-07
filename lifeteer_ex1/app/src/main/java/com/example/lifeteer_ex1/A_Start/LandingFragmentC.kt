package com.example.lifeteer_ex1.A_Start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lifeteer_ex1.databinding.FragmentLandingCBinding

class LandingFragmentC : Fragment() {
    private lateinit var binding: FragmentLandingCBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLandingCBinding.inflate(inflater, container, false)
        return binding.root
    }
}