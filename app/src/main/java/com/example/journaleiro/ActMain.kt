package com.example.journaleiro


import androidx.activity.viewModels
import com.example.journaleiro.base.ActBind
import com.example.journaleiro.custom.viewBind
import com.example.journaleiro.databinding.ActMainBinding
import com.example.journaleiro.viewmodel.ActMainViewModel
import java.util.*

class ActMain : ActBind<ActMainBinding>() {
    override val binding: ActMainBinding by viewBind()
    private val viewModel:ActMainViewModel by viewModels()


    override fun ActMainBinding.onBinding() {
        TODO("Not yet implemented")
        
    }
}