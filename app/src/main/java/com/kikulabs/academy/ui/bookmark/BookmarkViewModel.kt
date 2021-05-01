package com.kikulabs.academy.ui.bookmark

import androidx.lifecycle.ViewModel
import com.kikulabs.academy.data.CourseEntity
import com.kikulabs.academy.utils.DataDummy

class BookmarkViewModel : ViewModel() {
    fun getBookmarks(): List<CourseEntity> = DataDummy.generateDummyCourses()
}