package com.example.roombymyself.ui.theme

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.roombymyself.data.NameEntity

@Composable
fun ListItem(item:NameEntity){
    Row(modifier = Modifier.fillMaxWidth()) {
        Text(item.name, modifier = Modifier
            .fillMaxWidth()
            .weight(1f))
        IconButton(onClick = { }) {
            Icon(imageVector = Icons.Default.Delete, contentDescription = "Delete Button")

        }
    }
}