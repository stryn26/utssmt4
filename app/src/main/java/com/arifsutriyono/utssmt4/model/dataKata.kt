package com.arifsutriyono.utssmt4.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


data class dataKata(
    @StringRes val stringResourceId:Int,
    @DrawableRes val imageResourceId:Int){
//class untuk mengakses resource android studio berupa drawable dan String
}