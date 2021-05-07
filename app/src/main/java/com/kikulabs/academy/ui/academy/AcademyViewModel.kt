package com.kikulabs.academy.ui.academy

import androidx.lifecycle.ViewModel
import com.kikulabs.academy.data.CourseEntity
import com.kikulabs.academy.data.source.AcademyRepository

class AcademyViewModel(private val academyRepository: AcademyRepository) : ViewModel() {
    fun getCourses(): List<CourseEntity> = academyRepository.getAllCourses()
}