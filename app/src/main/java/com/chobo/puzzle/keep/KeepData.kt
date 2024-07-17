package com.chobo.puzzle.keep

import androidx.compose.runtime.Composable
import com.chobo.puzzle.share.ShareData

data class KeepData(
    val titl: String,
    val text: String,
    val foodImg: String,
    val category: CharCategory
)

object KeepDatas {
    fun getKeep(): ArrayList<KeepData> {
        val keepList: ArrayList<KeepData> = arrayListOf()
        keepList.add(
            KeepData(
                titl = "삼겹살 보관 방법",
                text = "삼겹살과 감자를 완전히 식힌다\n" +
                        "삼겹살과 감자를 적당한 크기로 자른다\n" +
                        "밀폐용기에 삼겹살과 감자를 담는다\n" +
                        "밀폐용기에 라벨을 붙이고 날짜를 적는다\n" +
                        "밀폐용기를 냉동실에 넣는다\n" +
                        "필요할 때 냉동실에서 꺼내 해동 후 다시 데워 먹는다",
                foodImg = "https://i.namu.wiki/i/I9Ncl4-CLb7t5RlbVynbbLVOAbhFrqRcAW0jOJB0Pnc13PaCvqtXFEC9_0YPVtiHkRcSru6I2hXh5FSlBi8hb1efN0IFXLN22mDlUi2_6hx4n-leihCXL7C4rH-QIayJsMpv8cGp4eYILEEIdgbjmg.webp",
                category = CharCategory.MEAT
            )
        )
        keepList.add(
            KeepData(
                titl = "양상추 보관 방법",
                text = "양상추를 씻어서 물기를 제거한다\n" +
                        "양상추를 적당한 크기로 자른다\n" +
                        "밀폐용기에 양상추를 담는다\n" +
                        "밀폐용기에 라벨을 붙이고 날짜를 적는다\n" +
                        "밀폐용기를 냉장실에 넣는다\n" +
                        "필요할 때 꺼내서 사용한다",
                foodImg = "https://i.namu.wiki/i/7GPYA0gkxbTbAYgIh5B9e7U26mxNyvtZlhNV2hjec0uKJbl6TVKkbTuKWOUGE40I5vhE9nJjNOZRaRhBM7YohZFD4jMzcINENdQbm3JLtixbw733KWTDC2TX4QXgZp2GfaCqChtCBK5Dlx1WlV9ITw.webp",
                category = CharCategory.VEGETABLE
            )
        )
        keepList.add(
            KeepData(
                titl = "딸기 보관 방법",
                text = "딸기를 씻어서 물기를 제거한다\n" +
                        "딸기를 밀폐용기에 담는다\n" +
                        "밀폐용기에 라벨을 붙이고 날짜를 적는다\n" +
                        "밀폐용기를 냉장실에 넣는다\n" +
                        "필요할 때 꺼내서 사용한다",
                foodImg = "https://i.namu.wiki/i/wp-K2OQgxxJLEk_gmmgKVl752OqBJCApZFeb-0e5e6tXVEO51SGptvTarykkAeSvp4Tq0XWm1rwRt-zLJI6bNCi01cNi2iRpUOyGkNh1U8eMj2xqsjRN4S7gZDFhEo0YFgjI3qGoYjkp4GV73nBf1A.jpg",
                category = CharCategory.FRUIT
            )
        )
        keepList.add(
            KeepData(
                titl = "조리된 음식 보관 방법",
                text = "조리된 음식을 완전히 식힌다\n" +
                        "조리된 음식을 밀폐용기에 담는다\n" +
                        "밀폐용기에 라벨을 붙이고 날짜를 적는다\n" +
                        "밀폐용기를 냉장실에 넣는다\n" +
                        "필요할 때 꺼내서 데워 먹는다",
                foodImg = "https://www.adobe.com/kr/creativecloud/photography/hub/features/media_19243bf806dc1c5a3532f3e32f4c14d44f81cae9f.jpeg?width=2000&format=webply&optimize=medium",
                category = CharCategory.COOKED_FOOD
            )
        )
        return keepList
    }
}


// Define CharCategory enum class
enum class CharCategory {
    MEAT,
    VEGETABLE,
    FRUIT,
    COOKED_FOOD
}

