package com.example.basicsetup.mvvm.intro.view

import AppNavigation.navigateToLogin
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.basicsetup.R
import com.example.basicsetup.databinding.ActivityIntroBinding
import com.example.basicsetup.helper.AppController

class IntroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_intro)

        onClickListeners()
    }

    private fun onClickListeners(){
        binding.btnEnglish.setOnClickListener {
            AppController.instance.englishLanguage()
            navigateToLogin()
        }
        binding.btnArabic.setOnClickListener {
            AppController.instance.arabicLanguage()
            navigateToLogin()
        }
    }
}