package com.bintianqi.owndroid.feature.work_profile

import android.content.Intent
import com.bintianqi.owndroid.R
import kotlinx.serialization.Serializable

@Serializable
data class IntentFilterOptions(
    val action: String, val category: String, val mimeType: String,
    val direction: Int // 1: private to work, 2: work to private, 3: both
)

val crossProfileIntentFilterPresets = mapOf(
    R.string.allow_file_sharing to
            IntentFilterOptions(Intent.ACTION_SEND, Intent.CATEGORY_DEFAULT, "*/*", 3)
)
