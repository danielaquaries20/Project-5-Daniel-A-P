package com.example.project5_danielap

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Intent Implicit

        buttonLogin.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val message =
            "https://api.whatsapp.com/send?phone=6282134893829&text=Permisi,%20Perkenalkan%20nama%20saya"

        val i = Intent(
            Intent.ACTION_VIEW,
            Uri.parse(message)
        )
        startActivity(i)
    }
}