package com.example.journaleiro.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import java.util.*

class ActMainViewModel(application: Application) : AndroidViewModel(application) {
    private val calendar = Calendar.getInstance()
    val weekYear = calendar.weekYear
}