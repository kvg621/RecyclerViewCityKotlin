package com.example.transactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

val TAG = "TAGS"


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerview: RecyclerView = findViewById(R.id.recyclerview)
        recyclerview.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        val cityList = listOf<String>("Moscow", "London", "Kiev","Samara", "Ulyanovsk")
        recyclerview.adapter = CityAdapter(cityList)

    }
}

//private fun generateList(): List<String> {
//    val values = mutableListOf<String>()
//    for (i in 0..1000) {
//        values.add("$i -й элемент")
//    }
//    return values
//}
