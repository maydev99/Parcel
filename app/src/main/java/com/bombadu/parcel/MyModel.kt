package com.bombadu.parcel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MyModel (
    val title: String,
    val details: String,
    val price: String,
    val category: String
) : Parcelable