package com.example.mydemoapplication.data.di

import com.example.mydemoapplication.data.repository.ApiConstants
import com.example.mydemoapplication.data.repository.EstatusApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object EstatusApiModule {

    @Provides
    @Singleton
    fun provideApi(builder: Retrofit.Builder):EstatusApi{
        return builder
            .build()
            .create(EstatusApi::class.java)

    }

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit.Builder{
        return Retrofit.Builder()
            .baseUrl(ApiConstants.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
    }
}