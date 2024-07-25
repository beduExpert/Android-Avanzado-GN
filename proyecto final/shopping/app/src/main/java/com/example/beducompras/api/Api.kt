package com.example.beducompras.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object Api {
    private const val STORE_URL = "https://fakestoreapi.com/"

    // TODO: declarar nuestro storeService, que construiremos con retrofit.
    // Este debe ser una implementación de FakeStoreService
}