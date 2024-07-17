////package com.chobo.puzzle.keep
////
////import androidx.compose.foundation.layout.Column
////import androidx.compose.foundation.layout.Row
////import androidx.compose.foundation.lazy.LazyColumn
////import androidx.compose.foundation.lazy.items
////import androidx.compose.runtime.Composable
////import androidx.navigation.NavHostController
////import com.chobo.puzzle.share.ShareData
////import com.chobo.puzzle.share.card.ShareCard
////
////@Composable
////fun KeepScreen(
////    keeps: List<KeepData>, // 이름을 Card에서 cards로 변경하였습니다.
////    navController: NavHostController,
////){
////    Row {
////
////        LazyColumn {
////            items(keeps) { keepData ->
////                ShareCard(
////                    KeepData =  keepData,
////                    onClick = {
////                        navController.navigate("Recipe/${keepData.titl}")
////                    }
////                )
////            }
////        }
////    }
////}
//
//package com.chobo.puzzle.keep
//
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.items
//import androidx.compose.runtime.Composable
//import androidx.navigation.NavHostController
//import com.chobo.puzzle.share.ShareData
//import com.chobo.puzzle.share.card.ShareCard
//
//@Composable
//fun KeepScreen(
//    keeps: List<KeepData>, // 이름을 Card에서 cards로 변경하였습니다.
//    navController: NavHostController,
//){
//    Row {
//
//        LazyColumn {
//            items(keeps) { keepsData ->
//                ShareCard(
//                    KeepsData = keepsData,  // 여기서 'data'는 ShareCard 함수의 실제 매개변수 이름입니다.
//                    onClick = {
//                        navController.navigate("아무말/${keepData.titl}")
//                    }
//                )
//            }
//        }
//    }
//}

package com.chobo.puzzle.keep

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun KeepScreen(
    keeps: List<KeepData>,
    navController: NavHostController,
) {
    Row {
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
