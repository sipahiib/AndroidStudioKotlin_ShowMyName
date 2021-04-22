package com.sipahi.adimigoster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //buradan itibaren programımızız kodlarını oluşturuyoruz:
            btnGoster.setOnClickListener()
            {
                txtisimGoster.text=txtisimGir.text
                txtisimGir.text.clear()
            }
    }
}

