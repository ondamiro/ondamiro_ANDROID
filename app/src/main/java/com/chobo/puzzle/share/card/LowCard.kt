package com.chobo.puzzle.share.card

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.chobo.puzzle.R
import com.chobo.puzzle.share.ShareData

@Composable
fun ShareCard(
    shareData: ShareData,
    onClick: () -> Unit
){
    val pretendardFamily = FontFamily(
        Font(R.font.pretendard_semibold, FontWeight.SemiBold),
        Font(R.font.pretendard_medium, FontWeight.Medium),
        Font(R.font.pretendard_regular, FontWeight.Thin),
        Font(R.font.pretendard_bold, FontWeight.Bold),)
    // Box 내부에 배경색과 여백을 추가하여 디자인을 개선합니다.
    Box(
        modifier = Modifier
            .width(310.dp)
            .height(100.dp)
            .padding(bottom = 10.dp)
            .border(width = 1.dp, color = Color(0xffE5E5E5), shape = RoundedCornerShape(10.dp))
            .clickable { onClick() }

    ){
        Row (modifier = Modifier.background(color = Color.White),
            ){
            AsyncImage(
                modifier = Modifier.width(122.dp).height(75.dp),
                model = shareData.foodImg,
                contentDescription = null,
            )
            Column(modifier = Modifier.padding(start = 8.dp, top = 17.dp)) {
                // 제목과 시간 정보를 나란히 표시하는 Row
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(text = shareData.titl,
                        fontFamily = pretendardFamily,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 13.sp
                    )

                    Text(text = shareData.time.toString() + "분 전",
                        fontFamily = pretendardFamily,
                        fontWeight = FontWeight.Medium,
                        color = Color(0xffD2D2D2),
                        fontSize = 8.sp,
                        modifier = Modifier.padding(start = 3.dp)
                    )
                }
                // 데이터 정보를 쉼표로 구분하여 표시
                Text(text = shareData.data.keys.joinToString(", "),
                    color = Color(0xff7D7D7D),
                    fontFamily = pretendardFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 10.sp
                )
                // 주소 정보를 표시
                Text(text = shareData.address,
                    color = Color(0xff7D7D7D),
                    fontFamily = pretendardFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 7.sp
                )
            }
        }
    }
}

