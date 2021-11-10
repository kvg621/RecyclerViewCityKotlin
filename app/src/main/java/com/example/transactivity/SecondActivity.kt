package com.example.transactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val textView:TextView=findViewById(R.id.textView_second_act)
        val data = intent.extras?.get("TOTAL_COUNT").toString()
        Log.d("TAG",data)
        textView.text=data
    }
}