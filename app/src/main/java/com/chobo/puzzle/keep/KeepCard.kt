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

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.chobo.puzzle.navigation.BottomBar

@Composable
fun KeepSard(
    KeepsData: KeepData,
    onClick: () -> Unit
) {
    Column (
        modifier = Modifier
            .border(width = 1.dp, color = Color.White, shape = RoundedCornerShape(10.dp))
            .clickable { onClick() }
    ){
        AsyncImage(
            modifier = Modifier
                .width(122.dp)
                .height(75.dp)
                .background(color = Color.White)
                .border(width = 1.dp, color = Color.White, shape = RoundedCornerShape(10.dp)),
            model = KeepsData.foodImg, // 데이터 필드의 이미지 URL을 사용합니다.
            contentDescription = null,
        )
        Category(text = KeepsData.category.name)
        Text(text = KeepsData.titl)
        Text(
            text = if (KeepsData.text.length > 12) KeepsData.text.take(12) + "..." else KeepsData.text,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}
