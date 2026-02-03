package com.example.formation.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBar() {
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(),
        title = {
            Box(modifier = Modifier.fillMaxSize(),
                ) {
                Text("Mike Bom", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold,color = Color.Black, modifier = Modifier.align(Alignment.CenterStart))
                Icon(Icons.Default.Info , contentDescription = "info bull",modifier = Modifier.align(Alignment.CenterEnd).padding(end = 10.dp))

            }

        },

    )

}



@Preview(showSystemUi = true, showBackground = true)
@Composable
fun DefaultPreview() {
    MyTopAppBar()
}