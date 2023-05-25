package com.biniyam.questartbiniyam.api

import com.biniyam.questartbiniyam.utilities.Constants.API_KEY
import com.biniyam.questartbiniyam.utilities.Constants.BASE_URL
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import kotlin.time.DurationUnit

class ApiClient {

    private lateinit var retrofit: Retrofit


    private val requestInterceptor = Interceptor{chain ->
        val url = chain.request()
            .url
            .newBuilder()
                .addQueryParameter("", API_KEY)
            .build()

        val request = chain.request()
            .newBuilder()
            .url(url)
            .build()

        return@Interceptor chain.proceed(request)

    }
    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(requestInterceptor)
        .callTimeout(60, TimeUnit.SECONDS)
        .build()

    fun getClient(): Retrofit{
        retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit
    }
}