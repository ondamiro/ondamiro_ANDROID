package com.chobo.puzzle.together

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.chobo.puzzle.share.ShareData
import com.chobo.puzzle.share.card.ShareCard
import com.chobo.puzzle.user.UserData

@Composable
fun TogetherScreen(
    Togethers: List<TogetherData>, // 이름을 Card에서 cards로 변경하였습니다.
    navController: NavHostController,
    userData: UserData
){
    LazyColumn (
        modifier = Modifier.padding(top = 10.dp)
    ){
        items(Togethers) { togetherData ->
            TogetherData(
                userData = userData,
                togetherData = togetherData,
                onClick = {
                    navController.navigate("BuyPage/${togetherData.titl}")
                }
            )
        }
    }
}