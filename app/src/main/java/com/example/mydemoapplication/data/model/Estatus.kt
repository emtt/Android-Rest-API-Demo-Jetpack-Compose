package com.example.mydemoapplication.data.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Estatus(
    @Json(name = "id")
    val id: Long,
    @Json(name = "status")
    val status: String,
    @Json(name = "created")
    val created: String,
    @Json(name = "visible")
    val visible: Any?,
    @Json(name = "color")
    val color: String?=null,
    @Json(name = "orden")
    val orden: Long,
)
