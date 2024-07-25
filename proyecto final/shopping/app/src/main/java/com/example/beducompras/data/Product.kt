package com.example.beducompras.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlin.random.Random


@Parcelize
data class Product(
    val id: Int,
    val title: String,
    val price: Float,
    val description: String,
    val category: String,
    val image: String,

) : Parcelable{

    val scoreCount get()= Random.nextInt(5,1200)
    val rating get()= Random.nextDouble(3.6,5.0).toFloat()


}
