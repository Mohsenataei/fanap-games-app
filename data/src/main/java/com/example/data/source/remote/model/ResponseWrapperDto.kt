package com.example.data.source.remote.model

import com.google.gson.annotations.SerializedName

data class ResponseWrapperDto<T : Any>(
    @SerializedName("data")
    val data: T,

    @SerializedName("remote")
    val status: StatusDto
)