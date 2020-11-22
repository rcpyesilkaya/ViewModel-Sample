package com.recepyesilkaya.viewmodel_sample.viewmodel

import androidx.lifecycle.ViewModel
import java.text.SimpleDateFormat
import java.util.*

class MActivityViewModel : ViewModel() {
    private var time: String? = null

    fun getTimes(): String {
        time?.let {
            return it
        }
        return nowTime()
    }

    private fun nowTime(): String =
        SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(Date()).apply {
            time = this
        }
}

