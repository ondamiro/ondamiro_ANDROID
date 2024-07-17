package com.chobo.puzzle.share

data class ShareData(
    val titl: String,
    val recipe: String,
    val address:  String,
    val data: List<Any>? = null
)
