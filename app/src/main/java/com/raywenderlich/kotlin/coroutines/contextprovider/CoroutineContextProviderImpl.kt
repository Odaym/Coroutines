package com.raywenderlich.kotlin.coroutines.contextprovider

import kotlin.coroutines.CoroutineContext

class CoroutineContextProviderImpl(
    private val context: CoroutineContext
) : CoroutineContextProvider {

    override fun context(): CoroutineContext = context
}