package com.chobo.puzzle

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.chobo.puzzle.user.UserData

@Composable
fun MyScreen(
    User: UserData
){
    Text(text = User.point.toString())
}