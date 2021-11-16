package com.codinginflow.mvvmtodo.ui.tasks

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.codinginflow.mvvmtodo.data.TaskDao

class TaskViewModule @ViewModelInject constructor(
    private val taskDao: TaskDao
) : ViewModel () {
}