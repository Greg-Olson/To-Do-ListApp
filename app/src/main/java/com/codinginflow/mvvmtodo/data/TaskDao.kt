package com.codinginflow.mvvmtodo.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {

    //Room now makes this a compile time error instead of a run tim error.
    @Query("SELECT * FROM task_table")
    //A flow is an asynchonous stream of data
    //So when this is called we get a stream of tasks
    //Flow can only be used in kotlin coroutine
    fun getTask():Flow<List<Task>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(task: Task)

    @Update
    suspend fun update(task: Task)

    @Delete
    suspend fun delete(task: Task)
}