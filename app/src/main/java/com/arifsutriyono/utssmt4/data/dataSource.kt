package com.arifsutriyono.utssmt4.data

import com.arifsutriyono.utssmt4.R
import com.arifsutriyono.utssmt4.model.dataKata

class dataSource {
    fun loadDataKata(): List<dataKata>{
        //fungsi untuk memanggil data dari resource string dan drawable
        return listOf<dataKata>(
            dataKata(R.string.informasi_d3sia,R.drawable.d3sia),
            dataKata(R.string.informasi_smk1sewon,R.drawable.smk1sewon),
            dataKata(R.string.informasi_smk2magetan,R.drawable.iotsmk2magetan),
            dataKata(R.string.informasi_pmbutdi,R.drawable.pendaftaranutdi),
            dataKata(R.string.tipsSiaptmtb,R.drawable.tatapmukaterbatas),
            dataKata(R.string.tipsTalentaDigital,R.drawable.talentadigital9),
            dataKata(R.string.tipsTipeMahasiswa,R.drawable.jenismahasiswa),
            dataKata(R.string.tips_porto,R.drawable.membangunporto1),
            dataKata(R.string.tipsUcapanSelamatPuasa,R.drawable.selamatpuasa),
            dataKata(R.string.tips_6alasan_utdi,R.drawable.alasancerdaskuliahdiutdi6)
        )

    }
}