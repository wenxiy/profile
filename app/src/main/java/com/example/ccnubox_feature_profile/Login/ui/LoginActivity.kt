package com.example.ccnubox_feature_profile.Login.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.ccnubox_feature_profile.R
import com.example.ccnubox_feature_profile.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private val viewModel by lazy {
        ViewModelProviders.of(this).get(DataViewModel::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityLoginBinding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_login
        )
        //databing
        binding.lifecycleOwner = this
    }
}