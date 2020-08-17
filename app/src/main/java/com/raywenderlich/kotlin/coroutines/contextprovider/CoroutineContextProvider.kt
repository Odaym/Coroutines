package com.raywenderlich.kotlin.coroutines.contextprovider

import kotlin.coroutines.CoroutineContext

interface CoroutineContextProvider {
    fun context(): CoroutineContext
}