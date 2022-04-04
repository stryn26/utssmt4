package com.arifsutriyono.utssmt4.adapter

import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.arifsutriyono.utssmt4.R
import com.arifsutriyono.utssmt4.model.dataKata

class itemAdapter (private val context:Context , private val dataset:List<dataKata>){
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView =view.findViewById(R.id.item_title)
    }
}