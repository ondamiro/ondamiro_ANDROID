package com.chobo.puzzle.together

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.chobo.puzzle.R
import com.chobo.puzzle.user.UserData
import com.chobo.puzzle.user.UserDatass.userData

@Composable
fun BuyScreen(
    togethers: List<TogetherData>,
    title: String,
    userData: UserData,
    navController: NavHostController
){
    Column (
        modifier = Modifier.verticalScroll(rememberScrollState())
    ){
        Row(modifier = Modifier
            .fillMaxWidth(1f)
            .height(35.dp)
            .background(color = Color(0xffFF462D))
            .fillMaxWidth(1f)
            .height(35.dp)
        ){
            IconButton(onClick = { navController.popBackStack() },
                modifier = Modifier
                    .padding(start = 13.dp, top = 10.dp)
            ) {
                Icon(painterResource(id = R.drawable.back), contentDescription = null )
            }
            Text(text = "음식 보기", Modifier.padding(start = 5.dp), color = Color.White)
        }

        val filtered = togethers.filter { it.titl == title }.first()
        AsyncImage(
            modifier = Modifier
                .width(122.dp)
                .height(75.dp),
            model = filtered.foodImg,
            contentDescription = null,
        )
        Row {
            Text(text = filtered.titl)
            Text(text = "${filtered.collect}/${filtered.yet}")
        }
        Text(text = filtered.adress)
        Text(text = filtered.text)
        Text(text = "가격: ${filtered.point}")

        Button(onClick = {
            if (filtered.buy == 1){
                filtered.buy = 0
                filtered.collect += 1
                userData.point += filtered.point

//                buttonColor = Color.Gray
            }
            if(filtered.buy == 0){
                filtered.buy = 1
                filtered.collect += 1
                userData.point -= filtered.point

//                buttonColor.value = Color(0xffFF462D)
            }

        }) {
            Text(text = "${filtered.point}point")
        }
    }
}
