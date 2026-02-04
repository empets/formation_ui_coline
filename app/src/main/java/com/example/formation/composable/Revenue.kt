package com.example.formation.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.formation.data.Data
import com.example.formation.model.DataRevenue

@Composable
fun Revenue(dataReVenue: List<DataRevenue> = Data.dataRevenue) {

    Column(){
        Text(
            "Vos revenue",
             style = MaterialTheme.typography.bodyLarge,
             color = Color.Black,
             fontSize = 20.sp
        )
        Text(
            "Estimation 3 derniers mois",
            style = MaterialTheme.typography.bodyMedium,
            color = Color.DarkGray,
            fontSize = 18.sp
        )

        Card (
           colors =  CardDefaults.cardColors(containerColor = Color.White.copy(alpha = 0.6f )),
        ){
            Column (
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally,
            ){
                val  maxValues = dataReVenue.maxBy { it.value }
                dataReVenue.forEach {
                    DataRevenue(it, ratio = it.value/maxValues.value )
                }
            }


        }
    }
}


@Composable
fun DataRevenue(data: DataRevenue, ratio : Float) {
    Row(
        modifier = Modifier
        .fillMaxWidth().padding(8.dp, 6.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
                 data.title,
                 style = MaterialTheme.typography.bodyMedium,
                 color = Color.DarkGray,
                 fontSize = 20.sp,
                 softWrap = true,
                 modifier = Modifier.weight(1f)


          )
        Row (
            modifier = Modifier.weight(2f).fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
        ){
            Box(
                modifier = Modifier.height(10.dp).fillMaxWidth(ratio).
                clip(RoundedCornerShape(8.dp)).
                background(color = Color.Blue).weight(2f)

            )

        }


        Text(
            data.value.toString(),
            style = MaterialTheme.typography.bodyMedium,
            color = Color.DarkGray,
            fontSize = 20.sp,
            modifier = Modifier.weight(1f)

        )



    }



}




@Preview(showBackground = true,showSystemUi = true)
@Composable
fun RevenuePreview() {
    Revenue()
}