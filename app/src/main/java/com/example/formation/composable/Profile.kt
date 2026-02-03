package com.example.formation.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.formation.R

@Composable
fun Profile(){
    Row(
        modifier = Modifier.fillMaxWidth().padding(8.dp)
    ){
        Surface(
            modifier = Modifier.size(70.dp).clip(CircleShape),
        ){
            Image(
                painterResource(id = R.drawable.profile),
                "Profile Picture",

            )
        }
       Spacer(modifier = Modifier.width(8.dp))
        Column (){
            ProfileText(
                text = "Mike Son",
                color = Color.DarkGray,
                fonsSize = 13.sp,
                fontWeight = FontWeight.Medium
            )
            ProfileText(
                text = "67",
                color = Color.Black,
                fonsSize = 16.sp,
                fontWeight = FontWeight.Normal
            )
            ProfileText(
                text = "Mike Son",
                color = Color.Black,
                fonsSize = 16.sp,
                fontWeight = FontWeight.ExtraBold
            )

        }
    }

}

@Composable
fun ProfileText(text: String, color: Color, fonsSize: TextUnit, fontWeight: FontWeight) {
    Text(text = text, fontSize = fonsSize, textAlign = TextAlign.Start, color = color, fontWeight = fontWeight  )

}

@Preview(showBackground = true,)
@Composable
fun ProfilePreview(){
    Profile()
}