package com.example.lifeteer_ex1.A_Start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lifeteer_ex1.databinding.FragmentLandingABinding

class LandingFragmentA : Fragment() {
    private lateinit var binding: FragmentLandingABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLandingABinding.inflate(inflater, container, false)
        return binding.root
    }
}