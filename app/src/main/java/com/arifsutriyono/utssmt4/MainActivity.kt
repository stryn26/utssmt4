package com.arifsutriyono.utssmt4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.arifsutriyono.utssmt4.adapter.ItemAdapter
import com.arifsutriyono.utssmt4.data.dataSource
//import library yang diperlukan
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = dataSource().loadDataKata()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)//memilih id layout recycle view

        recyclerView.adapter = ItemAdapter(this,myDataset)//menggunakan adapter
        recyclerView.setHasFixedSize(true)

    }
}