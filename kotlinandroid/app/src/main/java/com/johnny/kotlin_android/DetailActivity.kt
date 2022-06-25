package com.johnny.kotlin_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.johnny.kotlin_android.databinding.ActivityDetailBinding
import com.johnny.kotlin_android.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_detail)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar!!.hide()


    }
}





