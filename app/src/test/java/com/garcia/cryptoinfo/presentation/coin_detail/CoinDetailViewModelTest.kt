
package com.garcia.cryptoinfo.presentation.coin_detail

import androidx.lifecycle.SavedStateHandle
import com.garcia.cryptoinfo.R
import com.garcia.cryptoinfo.common.Error
import com.garcia.cryptoinfo.common.ResultWrapper
import com.garcia.cryptoinfo.domain.model.CoinDetail
import com.garcia.cryptoinfo.domain.use_case.get_coin.GetCoinUseCase
import com.garcia.cryptoinfo.domain.utils.DomainObjectsMocks
import com.garcia.cryptoinfo.utils.CoroutineRule
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flowOf
import org.amshove.kluent.shouldBeEqualTo