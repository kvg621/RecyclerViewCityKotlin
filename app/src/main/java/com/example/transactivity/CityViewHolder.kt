package com.example.transactivity

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(cityName: String) {
val cityNameTextView:TextView=itemView.findViewById(R.id.textView_item)
     cityNameTextView.text=cityName
        itemView.setOnClickListener(){
            Toast.makeText(itemView.context, cityName, Toast.LENGTH_SHORT).show()
        }
    }
}

