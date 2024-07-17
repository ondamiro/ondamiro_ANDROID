package com.chobo.puzzle.keep

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Category(
    text: String
){
    Box(
        modifier = Modifier
            .background(color = Color(0xffFF462D))
            .border(width = 1.dp, color = Color(0xffFF462D), RoundedCornerShape(30.dp))
    ){
        Text(text = text, color = Color.White)
    }
}