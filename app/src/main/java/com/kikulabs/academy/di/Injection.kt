package com.kikulabs.academy.di

import android.content.Context
import com.kikulabs.academy.data.source.AcademyRepository
import com.kikulabs.academy.data.source.remote.RemoteDataSource
import com.kikulabs.academy.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): AcademyRepository {

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))

        return AcademyRepository.getInstance(remoteDataSource)
    }

}