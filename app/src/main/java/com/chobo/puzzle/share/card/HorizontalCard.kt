package com.chobo.puzzle.share.card
//
//
//import androidx.compose.foundation.layout.PaddingValues
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.pager.HorizontalPager
//import androidx.compose.foundation.pager.rememberPagerState
//import androidx.compose.foundation.text.BasicText
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.text.style.LineHeightStyle
//import androidx.compose.ui.unit.dp
//
//@Composable
//fun HorizontalPagerExample() {
//    // 5개의 페이지를 갖는 PagerState 생성, 초기 페이지는 0으로 설정
//    val pagerState = rememberPagerState(
//        pageCount = 5,
//        initialPage = 0
//    )
//
//    // 페이지를 표시하는 HorizontalPager
//    HorizontalPager(
//        state = pagerState, // PagerState 전달
//        modifier = Modifier.fillMaxSize(), // 부모의 최대 크기로 채움
//        contentPadding = PaddingValues(horizontal = 32.dp), // 컨텐츠에 수평 패딩 추가
//        pageSpacing = 16.dp // 각 페이지 사이의 간격
//    ) { page ->
//        // 각 페이지의 내용
//        BasicText(
//            text = "Page $page",
//            modifier = Modifier
//                .fillMaxSize()
//        )
//    }
//}
//
