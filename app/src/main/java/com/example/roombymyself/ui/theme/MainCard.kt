package com.example.roombymyself.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.roombymyself.MainViewModel

@Composable
fun MainCard(mainViewModel: MainViewModel= viewModel(factory = MainViewModel.factory)) {

    val itemsList = mainViewModel.itemsList.collectAsState(initial = emptyList())
    Column(modifier = Modifier.fillMaxSize()) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
    ) {
        TextField(value = mainViewModel.newText.value, onValueChange = {
                                                                       mainViewModel.newText.value=it

        }, modifier = Modifier
            .fillMaxWidth()
            .weight(1f), label = { Text(text = "Name") })

        IconButton(onClick = { mainViewModel.insertItem()}) {
            Icon(imageVector = Icons.Default.Add, contentDescription = "Add button")

        }
        Spacer(modifier = Modifier.height(8.dp))

        LazyColumn(modifier = Modifier.fillMaxWidth()){
            items(itemsList.value){
                // Разметканы осында саласын
                ListItem(it)
            }
        }
    }
}}