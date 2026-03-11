package br.com.carlosvillarinho.sortinghat.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import br.com.carlosvillarinho.sortinghat.model.House

@Composable
fun HouseArea(
    house: House?,
    state: SortingState
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        if (state == SortingState.IDLE || state == SortingState.SORTING) {
            SortingHatView(state = state)
        } else {
            HouseView(house = house)
        }

    }
}