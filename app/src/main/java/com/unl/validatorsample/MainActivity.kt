package com.unl.validatorsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.unl.addressvalidator.data.EnvironmentType
import com.unl.addressvalidator.ui.homescreen.UnlValidatorActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initValidator()
    }


    private fun initValidator()
    {
        try {
            UnlValidatorActivity.envType =  EnvironmentType.SANDBOX
            val intent = Intent(this, UnlValidatorActivity::class.java)
            startActivity(intent)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}