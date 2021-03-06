package com.example.consumodeapi

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
    @GET
    suspend fun getApiByBreeds(@Url url:String): Response<ApiResponse>
}