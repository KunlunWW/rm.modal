package com.garcia.cryptoinfo.domain.use_case.get_coin

import com.garcia.cryptoinfo.common.ResultWrapper
import com.garcia.cryptoinfo.domain.utils.DomainObjectsMocks
import com.garcia.cryptoinfo.domain.model.CoinDetail
import com.garcia.cryptoinfo.domain.repository.CoinRepository
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.count
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runBlockingTest
import org.amshove.kluent.shouldBeEqualTo
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class GetCoinUseCaseTest{

    private lateinit var useCase: GetCoinUseCase

    @MockK
    internal lateinit var repository: CoinRepository

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
        useCase = GetCoinUseCase(repository)
    }

    @ExperimentalCoroutinesApi
    @Test
    fun `should call getCoinById`() = runBlockingTest {
        // given
        given(ResultWrapper.Success(DomainObjectsMocks.getCoinDetail(COIN_ID)))

        // when
