package com.biniyam.questartbiniyam.api

import com.biniyam.questartbiniyam.response.ArtsListResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    //Todo: check this out /artworks?page=2

    @GET("/artworks")
    fun getTop12Artworks(@Query("page") page : Int) :Call<ArtsListResponse>

}