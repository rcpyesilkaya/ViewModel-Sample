package com.recepyesilkaya.viewmodel_sample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.recepyesilkaya.viewmodel_sample.R
import com.recepyesilkaya.viewmodel_sample.viewmodel.MActivityViewModel
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity() {

    var timeUI: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel: MActivityViewModel =
            ViewModelProvider(this).get(MActivityViewModel::class.java)

        textViewVM.text = viewModel.getTimes()

        textViewUI.text=getTimeUI()
    }

    @JvmName("getTimeUI1")
    fun getTimeUI(): String {
        timeUI?.let {
            return it
        }
        timeUI = SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(Date())
        return timeUI as String
    }
}