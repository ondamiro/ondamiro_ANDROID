package com.chobo.puzzle.keep

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.chobo.puzzle.R

@Composable
fun StorageMethodScreen(
    keeps: List<KeepData>,
    title: String,
    navController: NavHostController,
){
    val filteredKeeps = keeps.filter { it.titl == title }.first()

    Column {
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
            androidx.compose.material3.Text(text = "음식 보기", Modifier.padding(start = 5.dp), color = Color.White)
        }

        Column (
            Modifier.border(width = 1.dp, color = Color(0xffFF462D), shape = RoundedCornerShape(10.dp))
        ){
            AsyncImage(
                modifier = Modifier
                    .width(122.dp)
                    .height(75.dp)
                    .background(color = Color.White)
                    .border(width = 1.dp, color = Color.White, shape = RoundedCornerShape(10.dp)),
                model = filteredKeeps.foodImg, // 데이터 필드의 이미지 URL을 사용합니다.
                contentDescription = null,
            )
            Category(text = filteredKeeps.category.toString())
            Text(text = title)
            Box(
                modifier = Modifier
                    .background(color = Color(0xffFBF9F9))
                    .width(270.dp)
                    .height(70.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                androidx.compose.material3.Text(
                    text = filteredKeeps.text,
                )
            }
        }

        LazyColumn {
            items(keeps) { keepData ->
                KeepSard(
                    KeepsData = keepData,
                    onClick = {
                        navController.navigate("StorageMethod/${keepData.titl}")
                    }
                )
            }
        }
    }
}