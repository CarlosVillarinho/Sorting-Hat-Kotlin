package br.com.carlosvillarinho.sortinghat.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import br.com.carlosvillarinho.sortinghat.R

@Composable
fun SortingHatView(state: SortingState) {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier.size(500.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.sorting_hat_sticker),
                contentDescription = null,
                modifier = Modifier.height(325.dp)
            )
            if (state == SortingState.SORTING) {
                Box(
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                        .offset(y = 50.dp)
                ) {
                    SpeechBubble(text = "Hmm... difícil...")
                }
            }
        }
    }
}

@Preview
@Composable
private fun SortingHatViewPreview() {
    SortingHatView(SortingState.SORTING)
}