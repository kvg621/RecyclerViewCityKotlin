package com.example.transactivity

import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(cityName: String) {
        val cityNameTextView: TextView = itemView.findViewById(R.id.textView_item)
        val toastButton: Button = itemView.findViewById(R.id.toast_bottom)
        toastButton.setOnClickListener(){
            Toast.makeText(itemView.context, "Выбран город: ${cityName}", Toast.LENGTH_SHORT).show()
        }
        cityNameTextView.text = cityName
        itemView.setOnClickListener() {
            Toast.makeText(itemView.context, cityName, Toast.LENGTH_SHORT).show()
        }
    }
}

