package com.example.classroomcompass.network

import com.example.classroomcompass.models.Task

object TaskRepository {
    private val tasks = mutableListOf<Task>()

    fun getTasks(): List<Task> = tasks

    fun addTask(task: Task) {
        tasks.add(task)
    }

    // Initialize some sample tasks
    fun getSampleTasks() {
        tasks.add(Task(1, "Math Homework", "Page 12 exercises 1-10", "2025-12-05T17:00:00", "Mr. Smith"))
        tasks.add(Task(2, "Science Project", "Build a volcano model", "2025-12-06T12:00:00", "Ms. Lee"))
    }
}
