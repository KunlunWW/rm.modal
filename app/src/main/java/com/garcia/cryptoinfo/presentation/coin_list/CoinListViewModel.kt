
package com.garcia.cryptoinfo.presentation.coin_list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.garcia.cryptoinfo.R
import com.garcia.cryptoinfo.common.Error
import com.garcia.cryptoinfo.common.ResultWrapper
import com.garcia.cryptoinfo.domain.model.Coin
import com.garcia.cryptoinfo.domain.use_case.get_coins.GetCoinsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class CoinListViewModel @Inject constructor(
    private val getCoinsUseCase: GetCoinsUseCase,
) : ViewModel() {

    data class ViewState(