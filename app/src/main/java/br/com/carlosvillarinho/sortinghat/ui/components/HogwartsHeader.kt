package br.com.carlosvillarinho.sortinghat.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import br.com.carlosvillarinho.sortinghat.R
import br.com.carlosvillarinho.sortinghat.ui.theme.SortingHatTheme

@Composable
fun HogwartsHeader() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        HogwartsLogo()

        Text("E O CHAPÉU SELETOR",
            style = TextStyle(fontSize = 18.sp,
                              color = Color.White,
                              fontFamily = FontFamily(Font(resId = R.font.cinzel_decorative_bold))
            )
        )
    }
}

@Preview
@Composable
private fun HogwartsHeaderPreview() {
    SortingHatTheme{
        HogwartsHeader()
    }
}