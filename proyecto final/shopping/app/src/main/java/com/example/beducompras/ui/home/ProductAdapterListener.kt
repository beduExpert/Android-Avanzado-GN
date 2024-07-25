package com.example.beducompras.ui.home

import android.view.View
import com.example.beducompras.data.Product

interface ProductAdapterListener {
    fun onProductClicked(view: View, product: Product)
}