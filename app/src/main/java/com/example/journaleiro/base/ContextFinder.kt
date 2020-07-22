package com.example.journaleiro.base

import android.app.Activity
import android.app.Dialog
import android.view.View
import androidx.fragment.app.Fragment
import com.example.journaleiro.custom.activity

interface ContextFinder {

    val cont
        get() : Activity = when (this) {
            is Fragment -> requireContext().activity
            is View -> context.activity
            is Dialog -> context.activity
            else -> this as Activity
        }

}
