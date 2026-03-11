package br.com.carlosvillarinho.sortinghat.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import br.com.carlosvillarinho.sortinghat.R
import br.com.carlosvillarinho.sortinghat.model.House
import br.com.carlosvillarinho.sortinghat.ui.components.HogwartsHeader
import br.com.carlosvillarinho.sortinghat.ui.components.HouseArea
import br.com.carlosvillarinho.sortinghat.ui.components.SortingButton
import br.com.carlosvillarinho.sortinghat.ui.components.SortingState
import br.com.carlosvillarinho.sortinghat.ui.theme.SortingHatTheme

@Composable
fun SortingHatScreen() {

    val houses = listOf(
        House("Grifinória", R.drawable.gryffindor_1, Color.Red),
        House("Sonserina", R.drawable.slytherin_1, Color.Green),
        House("Corvinal", R.drawable.ravenclaw_1, Color.Blue),
        House("Lufa-Lufa", R.drawable.hufflepuff_1, Color.Yellow)
    )

    var selectedHouse by remember { mutableStateOf<House?>(null) }
    var state by remember { mutableStateOf<SortingState>(SortingState.IDLE) }

    fun sortedHouse(){
        selectedHouse = houses.random()
        state = SortingState.RESULT
    }

    Scaffold(containerColor = Color(0xFF0c0c1e)) { innerPadding ->
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)) {

            HogwartsHeader()

            Box(modifier = Modifier.fillMaxWidth().weight(1f)){
                HouseArea(
                    house = selectedHouse,
                    state = state)
            }

            SortingButton(state = state) { sortedHouse() }
        }
    }
}

@Preview
@Composable
private fun SortingHatScreenPreview() {
    SortingHatTheme{
        SortingHatScreen()
    }
}