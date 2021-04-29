package com.kikulabs.academy.ui.bookmark

import com.kikulabs.academy.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
