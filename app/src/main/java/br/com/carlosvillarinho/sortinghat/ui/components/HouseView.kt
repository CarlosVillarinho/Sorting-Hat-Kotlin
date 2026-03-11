package br.com.carlosvillarinho.sortinghat.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.carlosvillarinho.sortinghat.R
import br.com.carlosvillarinho.sortinghat.model.House
import androidx.compose.ui.graphics.Color

@Composable
fun HouseView(house: House?) {
    val imageRes = house?.imageRes ?: R.drawable.hogwarts_2
    val name = house?.name ?: "Hogwarts"
    Box(modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(imageRes),
                contentDescription = name,
                modifier = Modifier.height(200.dp)
            )
            if (house != null) {
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = house.name,
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold,
                    color = house.color)
            }
        }
    }
}

@Preview
@Composable
fun HouseViewNullPreview(modifier: Modifier = Modifier) {
    HouseView(null)
}

@Preview
@Composable
fun HouseViewWithHousePreview(modifier: Modifier = Modifier) {
    HouseView(House("Sonserina", R.drawable.slytherin_1, Color.Green))
}