package com.kikulabs.academy.ui.bookmark

import com.kikulabs.academy.data.source.local.entity.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
