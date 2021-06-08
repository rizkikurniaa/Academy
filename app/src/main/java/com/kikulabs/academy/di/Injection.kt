package com.kikulabs.academy.di

import android.content.Context
import com.kikulabs.academy.data.AcademyRepository
import com.kikulabs.academy.data.source.local.LocalDataSource
import com.kikulabs.academy.data.source.local.room.AcademyDatabase
import com.kikulabs.academy.data.source.remote.RemoteDataSource
import com.kikulabs.academy.utils.AppExecutors
import com.kikulabs.academy.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): AcademyRepository {

        val database = AcademyDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))
        val localDataSource = LocalDataSource.getInstance(database.academyDao())
        val appExecutors = AppExecutors()

        return AcademyRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }
}
