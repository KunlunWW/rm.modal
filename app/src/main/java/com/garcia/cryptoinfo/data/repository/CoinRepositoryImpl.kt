
package com.garcia.cryptoinfo.data.repository

import com.garcia.cryptoinfo.data.remote.client.CoinPaprikaApi
import com.garcia.cryptoinfo.data.remote.dto.toCoin
import com.garcia.cryptoinfo.data.remote.dto.toCoinDetail
import com.garcia.cryptoinfo.data.remote.network.ResponseHandler
import com.garcia.cryptoinfo.domain.model.Coin
import com.garcia.cryptoinfo.domain.model.CoinDetail
import com.garcia.cryptoinfo.common.ResultWrapper
import com.garcia.cryptoinfo.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(