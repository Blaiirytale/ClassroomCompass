package com.example.classroomcompass.models

data class ApiResponse<T>(
    val status: String,
    val data: List<T>
)
