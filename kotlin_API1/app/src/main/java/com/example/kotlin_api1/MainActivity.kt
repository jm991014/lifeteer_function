package com.example.kotlin_api1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlin_api1.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val emgMedAdapter by lazy {
        EmgMedAdapter()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = emgMedAdapter
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }

        binding.btnGet.setOnClickListener {
            retrofitWork()
        }
    }

    private fun retrofitWork() {
        val service = RetrofitApi.EmgMedService


        service.getEmgMedData(getString(R.string.api_key), "json")
            .enqueue(object : Callback<EmgMedResponse> {
                override fun onResponse(
                    call: Call<EmgMedResponse>,
                    response: Response<EmgMedResponse>
                ) {
                    if (response.isSuccessful) {
                        //Log.d("TAG", response.body().toString())
                        val result = response.body()?.emgMedInfo?.get(1)?.row
                        emgMedAdapter.submitList(result!!)
                    }
                }
                override fun onFailure(call: Call<EmgMedResponse>, t: Throwable) {
                    Log.d("TAG", t.message.toString())
                }
            })
    }
}