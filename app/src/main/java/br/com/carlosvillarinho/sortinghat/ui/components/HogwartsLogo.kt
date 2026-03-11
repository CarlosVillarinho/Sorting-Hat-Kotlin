package br.com.carlosvillarinho.sortinghat.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import br.com.carlosvillarinho.sortinghat.R
import br.com.carlosvillarinho.sortinghat.ui.theme.SortingHatTheme

@Composable
fun HogwartsLogo() {
    Text("HarryPotter",
        style = TextStyle(fontSize = 96.sp,
                          color = Color.White,
                          fontFamily = FontFamily(Font(resId = R.font.harryp__))
        )
    )
}

@Preview
@Composable
private fun HogwartsLogoPreview() {
    SortingHatTheme{
        HogwartsLogo()
    }
}
