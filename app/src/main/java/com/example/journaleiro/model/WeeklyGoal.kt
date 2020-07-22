package com.example.journaleiro.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "goals")
data class WeeklyGoal(

    @PrimaryKey(autoGenerate = true)
    var uid: Int = 0,

    @ColumnInfo(name = "goal_name")
    var noteName: String = "",

    @ColumnInfo(name = "goal_content")
    var musics:  String = ""

) : Parcelable
