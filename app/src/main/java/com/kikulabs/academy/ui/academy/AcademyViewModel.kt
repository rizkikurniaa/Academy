package com.kikulabs.academy.ui.academy

import androidx.lifecycle.ViewModel
import com.kikulabs.academy.data.CourseEntity
import com.kikulabs.academy.utils.DataDummy

class AcademyViewModel : ViewModel() {
    fun getCourses(): List<CourseEntity> = DataDummy.generateDummyCourses()
}