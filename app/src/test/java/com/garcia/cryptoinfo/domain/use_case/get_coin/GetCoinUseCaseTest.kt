package com.garcia.cryptoinfo.domain.use_case.get_coin

import com.garcia.cryptoinfo.common.ResultWrapper
import com.garcia.cryptoinfo.domain.utils.DomainObjectsMocks
import com.garcia.cryptoinfo.domain.model.CoinDetail
import com.garcia.cryptoinfo.domain.repository.CoinRepository
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.a