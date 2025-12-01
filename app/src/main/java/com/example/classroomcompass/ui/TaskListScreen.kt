package com.example.classroomcompass.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.sp
import com.example.classroomcompass.models.Task

@Composable
fun TaskListScreen(tasks: List<Task>) {
    LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        itemsIndexed(tasks) { index, task ->
            // Staggered offset for fun layout
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .offset(x = (index % 2 * 8).dp),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF3EA4EF)), // soft pink
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text("📚", fontSize = 18.sp) // cute emoji
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            task.title,
                            style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
                        )
                    }
                    Text(text = "Due: ${task.dueDate}", style = MaterialTheme.typography.bodyMedium)
                    Text(text = "Assigned by: ${task.assignedBy}", style = MaterialTheme.typography.bodySmall)
                }
            }
        }
    }
}
