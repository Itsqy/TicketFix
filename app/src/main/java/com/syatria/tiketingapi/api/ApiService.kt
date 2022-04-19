package com.syatria.tiketingapi.api

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("wisata")
    fun getWisata() : Call<ResponseListWisata>
}