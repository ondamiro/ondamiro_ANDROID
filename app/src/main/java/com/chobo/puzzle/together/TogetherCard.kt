package com.chobo.puzzle.together

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.chobo.puzzle.share.ShareData
import com.chobo.puzzle.user.UserData

@Composable
fun TogetherData(
    userData: UserData,
    togetherData: TogetherData,
    onClick: () -> Unit
){
    Box (
        modifier = Modifier
        .clickable { onClick() }
    ){
        Column {
            AsyncImage(
                modifier = Modifier
                    .width(122.dp)
                    .height(75.dp),
                model = togetherData.foodImg,
                contentDescription = null,
            )
            Row {
                Text(text = togetherData.titl)
                Text(text = "${togetherData.collect}/${togetherData.yet}")
            }
            Text(text = togetherData.adress)
            val buttonColor = remember { mutableStateOf(Color(0xffFF462D)) }
            Button(onClick = {
                if (togetherData.buy == 1){
                    togetherData.buy = 0
                    togetherData.collect += 1
                    userData.point += togetherData.point

                    buttonColor.value = Color.Gray
                }
                if(togetherData.buy == 0){
                    togetherData.buy = 1
                    togetherData.collect -= 1
                    userData.point -= togetherData.point

                    buttonColor.value = Color(0xffFF462D)
                }

            }) {
                Text(text = "${togetherData.point}point")
            }
        }
    }
}