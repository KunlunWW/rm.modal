package com.garcia.cryptoinfo.common

sealed class ResultWrapper<out T> {
    data class Success<out T>(val value: T?) : ResultWrapper<T>()
    data class Error(val code: Int? = null, v