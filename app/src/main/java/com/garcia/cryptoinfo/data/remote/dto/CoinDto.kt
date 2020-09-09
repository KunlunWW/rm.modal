package com.garcia.cryptoinfo.data.remote.dto


import com.google.gson.annotations.SerializedName
import com.garcia.cryptoinfo.domain.model.Coin

data class CoinDto(
    @SerializedName("id")
    val id: String,
    @Seriali