package com.example.formation.composable

import android.graphics.fonts.FontStyle
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.formation.data.Data
import com.example.formation.model.DataAnalityc

@Composable
fun Analitics(listData: List<DataAnalityc> = Data.dataAnalityc) {
    Row {
        AnliticsText(
            text = "Données analitiques du créateur ",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,


        )
        Spacer(modifier = Modifier.width(8.dp))
        AnliticsText(
            text = "28 derniers jours",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = Color.DarkGray,


        )

    }

    Spacer(modifier = Modifier.height(6.dp))

    Row {
       listData.forEach {
           CardElement(
                dataAnalytic = it,
               modifier = Modifier.weight(2f)
           )
       }
    }

}

@Composable
fun CardElement(dataAnalytic: DataAnalityc, modifier: Modifier = Modifier) {
    Card(
        elevation = CardDefaults.cardElevation(0.6.dp),
        shape = RoundedCornerShape(2.dp),
        modifier = modifier,
        colors = CardDefaults.cardColors(containerColor = Color.Transparent)

        ) {
        Column(modifier = Modifier.padding(4.dp)) {
            AnliticsText(
                text = dataAnalytic.title,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
            )
            Row {
                Text(
                    text = dataAnalytic.value,
                    style = MaterialTheme.typography.bodyLarge
                )
                Icon(Icons.Default.KeyboardArrowUp, contentDescription = null)
            }
        }

    }

}

@Composable
fun AnliticsText(text: String, fontWeight: FontWeight, fontSize: TextUnit, color: Color) {
    Text(
        text = text,
        fontWeight = fontWeight,
        fontSize = fontSize,
        overflow = TextOverflow.Ellipsis,
        color = color,
        softWrap = true,
        modifier = Modifier)
}

@Preview(showBackground = true, showSystemUi = true)
@Composable()
fun AnaliticsPreview() {
    Analitics()
}