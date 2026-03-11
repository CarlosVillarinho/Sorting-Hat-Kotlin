package br.com.carlosvillarinho.sortinghat.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SpeechBubble(text: String) {
    Box(modifier = Modifier
        .background(Color.White, shape = RoundedCornerShape(12.dp))
        .padding(horizontal = 14.dp, vertical = 8.dp)) {
        Text(text, color = Color.Black, fontWeight = FontWeight.Bold)
    }
}

@Preview
@Composable
private fun SpeechBubblePreview() {
    SpeechBubble("Hummm... Dificil")
}