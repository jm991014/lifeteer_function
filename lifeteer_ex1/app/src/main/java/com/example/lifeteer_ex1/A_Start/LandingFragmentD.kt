package com.example.lifeteer_ex1.A_Start

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lifeteer_ex1.C_Main.MainActivity
import com.example.lifeteer_ex1.databinding.FragmentLandingDBinding

class LandingFragmentD : Fragment() {

    private lateinit var binding: FragmentLandingDBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLandingDBinding.inflate(inflater, container, false)

        binding.fragDBtnStart.setOnClickListener {
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
        }
        return binding.root
    }
}