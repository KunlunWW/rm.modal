package com.garcia.cryptoinfo.data.remote.client

import com.garcia.cryptoinfo.data.remote.dto.CoinDetailDto
import com.garcia.cryptoinfo.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    @GET("v1/c