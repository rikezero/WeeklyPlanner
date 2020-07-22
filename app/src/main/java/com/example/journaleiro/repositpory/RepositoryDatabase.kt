package com.example.journaleiro.repositpory

import android.content.Context
import com.example.journaleiro.data.DatabaseBuilder
import com.example.journaleiro.data.dao.AccessNotes


class RepositoryDatabase(context: Context) {
    private var database = DatabaseBuilder.getAppDatabase(context)
    private var accessPlay = database.accessNotes()

    fun getNotes(): AccessNotes {
        return accessPlay
    }
}