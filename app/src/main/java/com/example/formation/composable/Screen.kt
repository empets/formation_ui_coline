package com.example.formation.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun Screen() {
    Scaffold(
        topBar = {
            MyTopAppBar()

        },
        bottomBar = {
           // MyBottomAppBar()
        }
    ) {
            Column(modifier = Modifier.padding(it)) {
                Profile()
                Analitics()
                Revenue()
                LastContent()
            }
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ScreenPreview() {
    Screen()
}