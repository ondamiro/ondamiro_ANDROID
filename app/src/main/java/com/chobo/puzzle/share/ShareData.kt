package com.chobo.puzzle.share

import androidx.compose.ui.graphics.painter.Painter

data class ShareData(
    val titl: String,
    val time: Int,
    val recipe: String,
    val address:  String,
    val data: Map<String, Any>,
    val special: String? = null,
    val foodImg: String,
    val eat: Int
)
