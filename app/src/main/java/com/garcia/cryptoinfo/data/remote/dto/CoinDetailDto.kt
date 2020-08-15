
package com.garcia.cryptoinfo.data.remote.dto


import com.google.gson.annotations.SerializedName
import com.garcia.cryptoinfo.domain.model.CoinDetail

data class CoinDetailDto(
    @SerializedName("contract")
    val contract: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("development_status")
    val developmentStatus: String,
    @SerializedName("first_data_at")
    val firstDataAt: String,
    @SerializedName("hardware_wallet")