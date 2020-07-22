package com.example.journaleiro.data.dao

import androidx.room.*
import com.example.journaleiro.model.WeeklyGoal

@Dao
interface AccessNotes {
    @get:Query("SELECT * FROM goals")
    val all: List<WeeklyGoal>

    @Query("SELECT * FROM goals WHERE goal_name LIKE :name")
    fun findByName(name: String): WeeklyGoal

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg notes: WeeklyGoal)

    @Delete
    fun delete(weeklyGoal: WeeklyGoal)

    @Update
    fun update(weeklyGoal: WeeklyGoal)
}
