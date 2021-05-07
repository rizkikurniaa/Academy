package com.kikulabs.academy.ui.bookmark

import androidx.lifecycle.ViewModel
import com.kikulabs.academy.data.CourseEntity
import com.kikulabs.academy.data.source.AcademyRepository

class BookmarkViewModel(private val academyRepository: AcademyRepository) : ViewModel() {
    fun getBookmarks(): List<CourseEntity> = academyRepository.getBookmarkedCourses()
}