package com.garcia.cryptoinfo.domain.repository

import com.garcia.cryptoinfo.domain.model.Coin
import com.garcia.cryptoinfo.domain.model.CoinDetail
import com.garcia.cryptoinfo.common.ResultWrapper

interface CoinRepository {

    suspend fun getC