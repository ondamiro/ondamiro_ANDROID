package com.chobo.puzzle.navigation

import android.graphics.drawable.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.chobo.puzzle.R

sealed class BottomBar (
    val rout: String,
    val icon: Int,
    val label: String,
//    val icon: @Composable () -> ImageVector
){
    object Together: BottomBar("Together", R.drawable.together_icon, "Together")
    object Share: BottomBar("Share", R.drawable.share_icon, "Share")
    object Keep: BottomBar("Keep", R.drawable.keep_icon, "Keep")
    object Mypage: BottomBar("Mypage", R.drawable.mypage_icon, "Mypage")

}