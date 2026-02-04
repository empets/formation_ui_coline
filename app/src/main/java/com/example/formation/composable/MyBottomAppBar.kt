package com.example.formation.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyBottomAppBar() {

  Box(
  modifier = Modifier.fillMaxWidth().padding(bottom = 56.dp)
  ){
      Row (
          verticalAlignment = Alignment.Bottom,
          horizontalArrangement = Arrangement.SpaceEvenly,
          modifier = Modifier.fillMaxWidth().background(color = MaterialTheme.colorScheme.surface)

      ) {
          BottomMenuItem(icon = Icons.Default.Home , title = "Dashboard")
          BottomMenuItem(icon = Icons.Default.List, title = "Contenus")
          BottomMenuItem(icon = Icons.Default.CheckCircle, title = "Analytics")
          BottomMenuItem(icon = Icons.Default.Email, title = "Commentaire")
      }
  }

}

@Composable
fun BottomMenuItem(icon: ImageVector, title: String, ) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.size(width = 70.dp, height = 40.dp)

    ){
        Icon(imageVector = icon, contentDescription = null,)
        Text(text = title, overflow = TextOverflow.Ellipsis,
            style = MaterialTheme.typography.labelMedium)
    }
}

@Preview(showSystemUi = true,showBackground = true)
@Composable
fun MyBottomAppBarPreview() {
    MyBottomAppBar()
}