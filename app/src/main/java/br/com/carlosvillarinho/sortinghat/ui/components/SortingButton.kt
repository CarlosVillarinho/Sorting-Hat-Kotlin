package br.com.carlosvillarinho.sortinghat.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.carlosvillarinho.sortinghat.R

enum class SortingState{
    IDLE,
    SORTING,
    RESULT
}

@Composable
fun SortingButton(state: SortingState, onPressed: () -> Unit) {
    //variaveis criadas para mandar para nos os resultados
    val text = when(state){
        SortingState.IDLE -> "Descobrir mina casa"
        SortingState.SORTING -> "Pensanso..."
        SortingState.RESULT -> "Sua casa foi escolhida"
    }

    ElevatedButton(
        onClick = onPressed,
        enabled = state == SortingState.IDLE,
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        colors = ButtonDefaults.elevatedButtonColors(
            containerColor = Color(0xFF5D4037),
            contentColor = Color.White,
            disabledContainerColor = Color(0xFF5D4037).copy(alpha = 0.6f),
            disabledContentColor = Color.White.copy(alpha = 0.6f),

        )
    ) {
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            Image(painter = painterResource(R.drawable.icone_chapeu_seletor),
                contentDescription = "Chapéu Seletor",
                colorFilter = ColorFilter.tint(Color.White),
                modifier = Modifier.height(40.dp)
            )

            Spacer(modifier = Modifier.width(12.dp))
            Text(text,
                fontSize = 18.sp)
        }
    }
}

@Preview
@Composable
private fun SortingButtonIdlePreview() {
    SortingButton(SortingState.IDLE) { }
}

@Preview
@Composable
private fun SortingButtonSortingPreview() {
    SortingButton(SortingState.SORTING) { }
}

@Preview
@Composable
private fun SortingButtonResultPreview() {
    SortingButton(SortingState.RESULT) { }
}