package com.arifsutriyono.utssmt4.data

import com.arifsutriyono.utssmt4.R
import com.arifsutriyono.utssmt4.model.dataKata

class dataSource {
    fun loadDataKata(): List<dataKata>{
        return listOf<dataKata>(
            dataKata(R.string.informasi_d3sia),
            dataKata(R.string.informasi_smk1sewon),

        )
    }
}