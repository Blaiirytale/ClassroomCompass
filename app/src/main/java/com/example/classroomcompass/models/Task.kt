package com.example.classroomcompass.models

data class Task(
    val id: Int,
    val title: String,
    val description: String,
    val dueDate: String,
    val assignedBy: String
)
