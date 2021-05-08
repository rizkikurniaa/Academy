package com.kikulabs.academy.ui.academy

import androidx.lifecycle.ViewModel
import com.kikulabs.academy.data.source.local.entity.CourseEntity
import com.kikulabs.academy.data.AcademyRepository

class AcademyViewModel(private val academyRepository: AcademyRepository) : ViewModel() {
    fun getCourses(): List<CourseEntity> = academyRepository.getAllCourses()
}