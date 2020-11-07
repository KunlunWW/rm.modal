package com.garcia.cryptoinfo.data.remote.network

import com.garcia.cryptoinfo.common.ResultWrapper
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class ResponseHandler @Inject constructor() {

    suspend operator fun <T : Any> invoke(apiCall: suspend () -> T): ResultWrapper<T> {
        return try {
            ResultWrapper.Success(apiCall.invoke())
        } catch (throwable: Throwable) {
            val errorMessage = throwable.localizedMessage
            when (throwable) {
                is IOException -> ResultWrapper.NetworkErr