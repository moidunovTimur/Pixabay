package com.example.pixabay

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PixabayApi {
    @GET("api/")

    fun getImages(
    @Query("q")search:String,
    @Query("page") page: Int,
    @Query("per_page") perPage : Int = 4,
    @Query("key")key:String = "36138131-a28f464f092cc515c219dc6a1"

    ):Call<PixaModel>
}
