package com.example.mydemoapplication.data.repository

import com.example.mydemoapplication.data.model.Estatus
import javax.inject.Inject


class EstatusRepo @Inject constructor(
    private val estatusApi: EstatusApi
) {
    suspend fun getEstatus(): List<Estatus>{
        return estatusApi.getEstatus()
    }
}