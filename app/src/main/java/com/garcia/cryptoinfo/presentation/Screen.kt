package com.garcia.cryptoinfo.presentation

sealed class Screen(val route: String) {
    object CoinListScreen: Screen("coin_l