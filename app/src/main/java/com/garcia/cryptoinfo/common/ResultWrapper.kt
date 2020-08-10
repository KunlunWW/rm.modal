package com.garcia.cryptoinfo.common

sealed class ResultWrapper<out T> {
    data class Success<out T>(val value: T?) : Re