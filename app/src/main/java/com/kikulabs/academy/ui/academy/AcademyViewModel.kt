package com.kikulabs.academy.ui.academy

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.kikulabs.academy.data.source.local.entity.CourseEntity
import com.kikulabs.academy.data.AcademyRepository
import com.kikulabs.academy.vo.Resource

class AcademyViewModel(private val academyRepository: AcademyRepository) : ViewModel() {
    fun getCourses(): LiveData<Resource<List<CourseEntity>>> = academyRepository.getAllCourses()
}