package com.devdroiddev.dagger2_mvvm.repository

import android.util.Log
import com.devdroiddev.dagger2_mvvm.models.Products
import com.devdroiddev.dagger2_mvvm.network.StoreApi
import com.devdroiddev.dagger2_mvvm.utils.APP_TAG
import javax.inject.Inject

class ProductRepository @Inject constructor(private val storeApi: StoreApi) {

    suspend fun getProducts(): List<Products> {
        val result = storeApi.getProducts()
        return if (result.isSuccessful && result.body() != null) {
            result.body()!!
        } else {
            Log.d(APP_TAG, "Error")
            emptyList()
        }
    }

}