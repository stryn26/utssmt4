package com.arifsutriyono.utssmt4.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.arifsutriyono.utssmt4.R
import com.arifsutriyono.utssmt4.model.dataKata

//import library yang dibutuhkan

class itemAdapter (
    private val context:Context ,
    private val dataset:List<dataKata>
    ):RecyclerView.Adapter<itemAdapter.ItemViewHolder>()
    {
    //melakukan deklarasi objek context dan data set
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView =view.findViewById(R.id.item_title)//import data string dari data source
        val imageView: ImageView =view.findViewById(R.id.item_image)//import data string dari data source
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)//menentukan layout item untuk daftar yang akan ditampilkan nanti

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]//mengambil posisi dari data yang diambil di data kata

        holder.textView.text =  context.resources.getString(item.stringResourceId)//import text dari string recource
        holder.imageView.setImageResource(item.imageResourceId)//import text dari imageResource
    }

    override fun getItemCount(): Int {
        return dataset.size//menghitung lebar data yang ada di dataset
    }
}