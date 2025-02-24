package com.chobo.puzzle.share.Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.chobo.puzzle.share.ShareData
import com.chobo.puzzle.share.ShareDatas
import com.chobo.puzzle.share.card.ShareCard




@Composable
fun ShareScreen(
    cards: List<ShareData>, // 이름을 Card에서 cards로 변경하였습니다.
    navController: NavHostController,
) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth(1f)
            .fillMaxHeight(1f)
    ){
        LazyRow (
            modifier = Modifier.padding(top = 10.dp)
        ){
            items(cards) { shareData ->
                ShareCard(
                    shareData = shareData,
                    onClick = {
                        navController.navigate("Recipe/${shareData.titl}")
                    }
                )
            }
        }


        LazyColumn {
            items(cards) { shareData ->
                ShareCard(
                    shareData = shareData,
                    onClick = {
                        navController.navigate("Recipe/${shareData.titl}")
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreShar(){
    val sampleData = ShareDatas.getShare() // 샘플 데이터를 가져오는 방식입니다.
    val navController = rememberNavController()
    ShareScreen(cards = sampleData, navController = navController)
}

