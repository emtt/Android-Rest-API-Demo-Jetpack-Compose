package com.example.mydemoapplication.data.repository

import com.example.mydemoapplication.data.model.Estatus
import retrofit2.http.GET

interface EstatusApi {
    @GET(ApiConstants.END_POINTS)
    suspend fun getEstatus():List<Estatus>
}