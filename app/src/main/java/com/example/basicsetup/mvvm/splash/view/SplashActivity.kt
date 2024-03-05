package com.example.basicsetup.mvvm.splash.view

import AppNavigation.navigateToHome
import AppNavigation.navigateToIntro
import android.annotation.SuppressLint
import android.os.Bundle

import androidx.databinding.DataBindingUtil
import com.example.basicsetup.R
import com.example.basicsetup.databinding.ActivitySplashBinding
import com.example.basicsetup.helper.BaseActivity
import com.example.basicsetup.helper.Extensions.handler
import com.example.basicsetup.helper.PrefUtils.isUserLoggedIn

@SuppressLint("CustomSplashScreen")
class SplashActivity : BaseActivity() {

    override fun onStart() {
        super.onStart()
        // Branch init
        /** after adding branch key in strings uncomment this*/
        /*Branch.sessionBuilder(this)
            .withData(this.intent.data)
            .withCallback { referringParams, error ->
                initSaveDeepLink(referringParams, error)
            }.init()*/
    }

    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)
        initializeFields()
    }

    private fun initializeFields() {
        handler(3000) {
            if (isUserLoggedIn()) {
                navigateToHome { finish() }
            } else {
                navigateToIntro()
                finish()
            }
        }
    }
}
