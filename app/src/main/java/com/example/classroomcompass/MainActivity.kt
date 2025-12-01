package com.example.classroomcompass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.classroomcompass.network.TaskRepository
import com.example.classroomcompass.ui.theme.ClassroomCompassTheme
import com.example.classroomcompass.ui.theme.TaskListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Initialize sample tasks before displaying
        TaskRepository.getSampleTasks()

        setContent {
            ClassroomCompassTheme {
                // Display the task list
                TaskListScreen(tasks = TaskRepository.getTasks())
            }
        }
    }
}
