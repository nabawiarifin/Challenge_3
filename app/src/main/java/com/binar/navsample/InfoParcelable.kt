package com.binar.navsample

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class InfoParcelable(
    val name: String,
    val age : Int,
    val address: String,
    val work: String
): Parcelable
