package com.example.formation.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.formation.R
import com.example.formation.data.Data
import com.example.formation.model.DataLastContent

@Composable
fun LastContent(dataLstContent: List<DataLastContent> = Data.dataLatContent){
    Column(

    ){
        Text(
            text = "Derniers contenus publiés",
            style = MaterialTheme.typography.bodyLarge,
            fontSize = 20.sp,
            softWrap = true,
            color = Color.DarkGray,
            fontWeight = FontWeight.W700
        )
        Spacer(modifier = Modifier.height(10.dp))
        dataLstContent.forEach {
            LastContentItem(it)
        }

    }

}

@Composable
fun LastContentItem(dataLstContent: DataLastContent){
    Box(
        modifier = Modifier.background(color = Color.White).clip(RoundedCornerShape(4.dp))
    ){

            Column {
                Row(
                    modifier = Modifier.padding(4.dp,9.dp)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.profile),
                        contentDescription = null,
                        modifier = Modifier.size(50.dp),)
                    Spacer(Modifier.width(5.dp))
                    Column {
                        Text(
                            text = dataLstContent.title,
                            style = MaterialTheme.typography.bodyLarge,
                            fontSize = 20.sp,
                            softWrap = true,
                            color = Color.DarkGray,
                            fontWeight = FontWeight.W700
                        )
                        Text(
                            text = dataLstContent.pulbliAt,
                            style = MaterialTheme.typography.bodyLarge,
                            fontSize = 15.sp,
                            color = Color.DarkGray)
                    }

                }
                Spacer(Modifier.fillMaxWidth().height(2.dp).background(Color.Gray.copy(alpha = 0.3F))
                )

                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 3.dp)
                ) {
                    LastContentItemActionButton(icon = Icons.Filled.Star, title = dataLstContent.star)
                    LastContentItemActionButton(icon = Icons.Filled.Check, title =  dataLstContent.checking)
                    LastContentItemActionButton(icon = Icons.Filled.Favorite, title = dataLstContent.favorite)
                }
                Spacer(Modifier.fillMaxWidth().height(2.dp).background(Color.Gray.copy(alpha = 0.3F)))
                Divider(

                )

        }
    }
}

@Composable
fun LastContentItemActionButton(icon: ImageVector, title: String,){
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        IconButton(onClick = {  }) {
            Icon(icon, contentDescription = null)
        }
        Text(title,style = MaterialTheme.typography.bodySmall, fontWeight = FontWeight.Bold)
    }
}
















@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LastContentPreview(){
    LastContent()
}