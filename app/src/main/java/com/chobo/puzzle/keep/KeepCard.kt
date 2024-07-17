//package com.chobo.puzzle.keep
//
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.width
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.unit.dp
//import coil.compose.AsyncImage
//
//@Composable
//fun KeepSard(
//    KeepsData: KeepData,
//    onClick: () -> Unit
//){
//    Column {
//        AsyncImage(
//            modifier = Modifier.width(122.dp).height(75.dp),
//            model = KeepData.,
//            contentDescription = null,
//        )
//    }
//}

package com.chobo.puzzle.keep

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun KeepSard(
    KeepsData: KeepData,
    onClick: () -> Unit
) {
    Column {
        AsyncImage(
            modifier = Modifier
                .width(122.dp)
                .height(75.dp),
            model = KeepsData.foodImg, // 데이터 필드의 이미지 URL을 사용합니다.
            contentDescription = null,
        )
        Text(text = "")
    }
}
