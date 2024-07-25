package com.example.beducompras.data

import android.graphics.drawable.Drawable
import com.example.beducompras.R

data class ProfileOption(
    val title: String,
    val icon: Int,
)

val profileOptions = listOf(
    ProfileOption("Mis direcciones", R.drawable.ic_location),
)