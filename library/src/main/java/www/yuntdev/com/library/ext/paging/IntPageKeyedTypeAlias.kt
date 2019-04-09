package com.qingmei2.rhine.ext.paging

import androidx.paging.PageKeyedDataSource
import io.reactivex.Flowable

//类型别名
typealias IntPageKeyedDataInitialProvider<T> = (PageKeyedDataSource.LoadInitialParams<Int>) -> Flowable<IntPageKeyedData<T>>

typealias IntPageKeyedDataEachTimeProvider<T> = (PageKeyedDataSource.LoadParams<Int>) -> Flowable<IntPageKeyedData<T>>

typealias OnDataSourceFetchError = (Throwable) -> Unit