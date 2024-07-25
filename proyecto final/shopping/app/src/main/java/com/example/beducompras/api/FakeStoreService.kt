package com.example.beducompras.api

import com.example.beducompras.data.Product
import retrofit2.Call
import retrofit2.http.GET

interface FakeStoreService {
    @GET("products")
    fun getProducts(): Call<List<Product>>
}