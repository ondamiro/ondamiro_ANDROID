package com.chobo.puzzle.share

import androidx.compose.ui.graphics.painter.Painter

//data class ShareData(
//    val titl: String,
//    val recipe: String,
//    val address:  String,
//    val data: List<Any>? = null,
//    val special: String? = null,
//    val foodImg: String
//)

object ShareDatas {
    fun getShare(): ArrayList<ShareData>{
        val shareList: ArrayList<ShareData> = arrayListOf(
            ShareData(
                "삼겹살",
                3,
                "준비물\n" +
                        "삼겹살(100g)\n" +
                        "마늘(10g)\n" +
                        "올리브유(5g)\n" +
                        "숯\n" +
                        "라임(1000g)\n" +
                        "감자(30g)\n" +
                        "후추(1g)\n" +
                        "소금(2g)\n" +
                        "\n" +
                        "삼겹살에 소금과 후추를 뿌린다\n" +
                        "마늘을 얇게 썬다\n" +
                        "감자를 껍질 벗기고 적당한 크기로 자른다\n" +
                        "감자에 소금과 올리브유를 뿌린다\n" +
                        "그릴에 숯을 넣고 불을 피운다\n" +
                        "숯이 적당히 달궈지면 삼겹살을 굽는다\n" +
                        "삼겹살이 반쯤 익으면 썰어둔 마늘을 넣는다\n" +
                        "삼겹살이 노릇노릇해질 때까지 굽는다\n" +
                        "감자를 그릴에 올려 굽는다\n" +
                        "삼겹살과 감자가 다 익으면 접시에 담는다\n" +
                        "라임을 반으로 잘라서 즙을 낸다\n" +
                        "구운 삼겹살에 라임즙을 뿌린다\n" +
                        "삼겹살과 감자를 함께 먹는다",
                "대구 달성군 구지면 창리로11길 93",
                mapOf(
                    "고기" to "2024.5,6",
                    "채소" to "2024.5,6",
                    "소스" to "2024.5,6"
                ),
                "개인 락앤락 통 필요함. 가져와주세요.",
                "https://i.namu.wiki/i/I9Ncl4-CLb7t5RlbVynbbLVOAbhFrqRcAW0jOJB0Pnc13PaCvqtXFEC9_0YPVtiHkRcSru6I2hXh5FSlBi8hb1efN0IFXLN22mDlUi2_6hx4n-leihCXL7C4rH-QIayJsMpv8cGp4eYILEEIdgbjmg.webp",
                4
            ),
            ShareData(
                "삼겹살",
                3,
                "준비물\n" +
                        "삼겹살(100g)\n" +
                        "마늘(10g)\n" +
                        "올리브유(5g)\n" +
                        "숯\n" +
                        "라임(1000g)\n" +
                        "감자(30g)\n" +
                        "후추(1g)\n" +
                        "소금(2g)\n" +
                        "\n" +
                        "삼겹살에 소금과 후추를 뿌린다\n" +
                        "마늘을 얇게 썬다\n" +
                        "감자를 껍질 벗기고 적당한 크기로 자른다\n" +
                        "감자에 소금과 올리브유를 뿌린다\n" +
                        "그릴에 숯을 넣고 불을 피운다\n" +
                        "숯이 적당히 달궈지면 삼겹살을 굽는다\n" +
                        "삼겹살이 반쯤 익으면 썰어둔 마늘을 넣는다\n" +
                        "삼겹살이 노릇노릇해질 때까지 굽는다\n" +
                        "감자를 그릴에 올려 굽는다\n" +
                        "삼겹살과 감자가 다 익으면 접시에 담는다\n" +
                        "라임을 반으로 잘라서 즙을 낸다\n" +
                        "구운 삼겹살에 라임즙을 뿌린다\n" +
                        "삼겹살과 감자를 함께 먹는다",
                "대구 달성군 구지면 창리로11길 93",
                mapOf(
                    "고기" to "2024.5,6",
                    "채소" to "2024.5,6",
                    "소스" to "2024.5,6"
                ),
                "개인 락앤락 통 필요함. 가져와주세요.",
                "https://i.namu.wiki/i/I9Ncl4-CLb7t5RlbVynbbLVOAbhFrqRcAW0jOJB0Pnc13PaCvqtXFEC9_0YPVtiHkRcSru6I2hXh5FSlBi8hb1efN0IFXLN22mDlUi2_6hx4n-leihCXL7C4rH-QIayJsMpv8cGp4eYILEEIdgbjmg.webp",
                4
            ),
            ShareData(
                "삼겹살",
                3,
                "준비물\n" +
                        "삼겹살(100g)\n" +
                        "마늘(10g)\n" +
                        "올리브유(5g)\n" +
                        "숯\n" +
                        "라임(1000g)\n" +
                        "감자(30g)\n" +
                        "후추(1g)\n" +
                        "소금(2g)\n" +
                        "\n" +
                        "삼겹살에 소금과 후추를 뿌린다\n" +
                        "마늘을 얇게 썬다\n" +
                        "감자를 껍질 벗기고 적당한 크기로 자른다\n" +
                        "감자에 소금과 올리브유를 뿌린다\n" +
                        "그릴에 숯을 넣고 불을 피운다\n" +
                        "숯이 적당히 달궈지면 삼겹살을 굽는다\n" +
                        "삼겹살이 반쯤 익으면 썰어둔 마늘을 넣는다\n" +
                        "삼겹살이 노릇노릇해질 때까지 굽는다\n" +
                        "감자를 그릴에 올려 굽는다\n" +
                        "삼겹살과 감자가 다 익으면 접시에 담는다\n" +
                        "라임을 반으로 잘라서 즙을 낸다\n" +
                        "구운 삼겹살에 라임즙을 뿌린다\n" +
                        "삼겹살과 감자를 함께 먹는다",
                "대구 달성군 구지면 창리로11길 93",
                mapOf(
                    "고기" to "2024.5,6",
                    "채소" to "2024.5,6",
                    "소스" to "2024.5,6"
                ),
                "개인 락앤락 통 필요함. 가져와주세요.",
                "https://i.namu.wiki/i/I9Ncl4-CLb7t5RlbVynbbLVOAbhFrqRcAW0jOJB0Pnc13PaCvqtXFEC9_0YPVtiHkRcSru6I2hXh5FSlBi8hb1efN0IFXLN22mDlUi2_6hx4n-leihCXL7C4rH-QIayJsMpv8cGp4eYILEEIdgbjmg.webp",
                4
            ),ShareData(
                "삼겹살",
                3,
                "준비물\n" +
                        "삼겹살(100g)\n" +
                        "마늘(10g)\n" +
                        "올리브유(5g)\n" +
                        "숯\n" +
                        "라임(1000g)\n" +
                        "감자(30g)\n" +
                        "후추(1g)\n" +
                        "소금(2g)\n" +
                        "\n" +
                        "삼겹살에 소금과 후추를 뿌린다\n" +
                        "마늘을 얇게 썬다\n" +
                        "감자를 껍질 벗기고 적당한 크기로 자른다\n" +
                        "감자에 소금과 올리브유를 뿌린다\n" +
                        "그릴에 숯을 넣고 불을 피운다\n" +
                        "숯이 적당히 달궈지면 삼겹살을 굽는다\n" +
                        "삼겹살이 반쯤 익으면 썰어둔 마늘을 넣는다\n" +
                        "삼겹살이 노릇노릇해질 때까지 굽는다\n" +
                        "감자를 그릴에 올려 굽는다\n" +
                        "삼겹살과 감자가 다 익으면 접시에 담는다\n" +
                        "라임을 반으로 잘라서 즙을 낸다\n" +
                        "구운 삼겹살에 라임즙을 뿌린다\n" +
                        "삼겹살과 감자를 함께 먹는다",
                "대구 달성군 구지면 창리로11길 93",
                mapOf(
                    "고기" to "2024.5,6",
                    "채소" to "2024.5,6",
                    "소스" to "2024.5,6"
                ),
                "개인 락앤락 통 필요함. 가져와주세요.",
                "https://i.namu.wiki/i/I9Ncl4-CLb7t5RlbVynbbLVOAbhFrqRcAW0jOJB0Pnc13PaCvqtXFEC9_0YPVtiHkRcSru6I2hXh5FSlBi8hb1efN0IFXLN22mDlUi2_6hx4n-leihCXL7C4rH-QIayJsMpv8cGp4eYILEEIdgbjmg.webp",
                4
            ),ShareData(
                "삼겹살",
                3,
                "준비물\n" +
                        "삼겹살(100g)\n" +
                        "마늘(10g)\n" +
                        "올리브유(5g)\n" +
                        "숯\n" +
                        "라임(1000g)\n" +
                        "감자(30g)\n" +
                        "후추(1g)\n" +
                        "소금(2g)\n" +
                        "\n" +
                        "삼겹살에 소금과 후추를 뿌린다\n" +
                        "마늘을 얇게 썬다\n" +
                        "감자를 껍질 벗기고 적당한 크기로 자른다\n" +
                        "감자에 소금과 올리브유를 뿌린다\n" +
                        "그릴에 숯을 넣고 불을 피운다\n" +
                        "숯이 적당히 달궈지면 삼겹살을 굽는다\n" +
                        "삼겹살이 반쯤 익으면 썰어둔 마늘을 넣는다\n" +
                        "삼겹살이 노릇노릇해질 때까지 굽는다\n" +
                        "감자를 그릴에 올려 굽는다\n" +
                        "삼겹살과 감자가 다 익으면 접시에 담는다\n" +
                        "라임을 반으로 잘라서 즙을 낸다\n" +
                        "구운 삼겹살에 라임즙을 뿌린다\n" +
                        "삼겹살과 감자를 함께 먹는다",
                "대구 달성군 구지면 창리로11길 93",
                mapOf(
                    "고기" to "2024.5,6",
                    "채소" to "2024.5,6",
                    "소스" to "2024.5,6"
                ),
                "개인 락앤락 통 필요함. 가져와주세요.",
                "https://i.namu.wiki/i/I9Ncl4-CLb7t5RlbVynbbLVOAbhFrqRcAW0jOJB0Pnc13PaCvqtXFEC9_0YPVtiHkRcSru6I2hXh5FSlBi8hb1efN0IFXLN22mDlUi2_6hx4n-leihCXL7C4rH-QIayJsMpv8cGp4eYILEEIdgbjmg.webp",
                4
            ),ShareData(
                "삼겹살",
                3,
                "준비물\n" +
                        "삼겹살(100g)\n" +
                        "마늘(10g)\n" +
                        "올리브유(5g)\n" +
                        "숯\n" +
                        "라임(1000g)\n" +
                        "감자(30g)\n" +
                        "후추(1g)\n" +
                        "소금(2g)\n" +
                        "\n" +
                        "삼겹살에 소금과 후추를 뿌린다\n" +
                        "마늘을 얇게 썬다\n" +
                        "감자를 껍질 벗기고 적당한 크기로 자른다\n" +
                        "감자에 소금과 올리브유를 뿌린다\n" +
                        "그릴에 숯을 넣고 불을 피운다\n" +
                        "숯이 적당히 달궈지면 삼겹살을 굽는다\n" +
                        "삼겹살이 반쯤 익으면 썰어둔 마늘을 넣는다\n" +
                        "삼겹살이 노릇노릇해질 때까지 굽는다\n" +
                        "감자를 그릴에 올려 굽는다\n" +
                        "삼겹살과 감자가 다 익으면 접시에 담는다\n" +
                        "라임을 반으로 잘라서 즙을 낸다\n" +
                        "구운 삼겹살에 라임즙을 뿌린다\n" +
                        "삼겹살과 감자를 함께 먹는다",
                "대구 달성군 구지면 창리로11길 93",
                mapOf(
                    "고기" to "2024.5,6",
                    "채소" to "2024.5,6",
                    "소스" to "2024.5,6"
                ),
                "개인 락앤락 통 필요함. 가져와주세요.",
                "https://i.namu.wiki/i/I9Ncl4-CLb7t5RlbVynbbLVOAbhFrqRcAW0jOJB0Pnc13PaCvqtXFEC9_0YPVtiHkRcSru6I2hXh5FSlBi8hb1efN0IFXLN22mDlUi2_6hx4n-leihCXL7C4rH-QIayJsMpv8cGp4eYILEEIdgbjmg.webp",
                4
            ),ShareData(
                "삼겹살",
                3,
                "준비물\n" +
                        "삼겹살(100g)\n" +
                        "마늘(10g)\n" +
                        "올리브유(5g)\n" +
                        "숯\n" +
                        "라임(1000g)\n" +
                        "감자(30g)\n" +
                        "후추(1g)\n" +
                        "소금(2g)\n" +
                        "\n" +
                        "삼겹살에 소금과 후추를 뿌린다\n" +
                        "마늘을 얇게 썬다\n" +
                        "감자를 껍질 벗기고 적당한 크기로 자른다\n" +
                        "감자에 소금과 올리브유를 뿌린다\n" +
                        "그릴에 숯을 넣고 불을 피운다\n" +
                        "숯이 적당히 달궈지면 삼겹살을 굽는다\n" +
                        "삼겹살이 반쯤 익으면 썰어둔 마늘을 넣는다\n" +
                        "삼겹살이 노릇노릇해질 때까지 굽는다\n" +
                        "감자를 그릴에 올려 굽는다\n" +
                        "삼겹살과 감자가 다 익으면 접시에 담는다\n" +
                        "라임을 반으로 잘라서 즙을 낸다\n" +
                        "구운 삼겹살에 라임즙을 뿌린다\n" +
                        "삼겹살과 감자를 함께 먹는다",
                "대구 달성군 구지면 창리로11길 93",
                mapOf(
                    "고기" to "2024.5,6",
                    "채소" to "2024.5,6",
                    "소스" to "2024.5,6"
                ),
                "개인 락앤락 통 필요함. 가져와주세요.",
                "https://i.namu.wiki/i/I9Ncl4-CLb7t5RlbVynbbLVOAbhFrqRcAW0jOJB0Pnc13PaCvqtXFEC9_0YPVtiHkRcSru6I2hXh5FSlBi8hb1efN0IFXLN22mDlUi2_6hx4n-leihCXL7C4rH-QIayJsMpv8cGp4eYILEEIdgbjmg.webp",
                4
            ),ShareData(
                "삼겹살",
                3,
                "준비물\n" +
                        "삼겹살(100g)\n" +
                        "마늘(10g)\n" +
                        "올리브유(5g)\n" +
                        "숯\n" +
                        "라임(1000g)\n" +
                        "감자(30g)\n" +
                        "후추(1g)\n" +
                        "소금(2g)\n" +
                        "\n" +
                        "삼겹살에 소금과 후추를 뿌린다\n" +
                        "마늘을 얇게 썬다\n" +
                        "감자를 껍질 벗기고 적당한 크기로 자른다\n" +
                        "감자에 소금과 올리브유를 뿌린다\n" +
                        "그릴에 숯을 넣고 불을 피운다\n" +
                        "숯이 적당히 달궈지면 삼겹살을 굽는다\n" +
                        "삼겹살이 반쯤 익으면 썰어둔 마늘을 넣는다\n" +
                        "삼겹살이 노릇노릇해질 때까지 굽는다\n" +
                        "감자를 그릴에 올려 굽는다\n" +
                        "삼겹살과 감자가 다 익으면 접시에 담는다\n" +
                        "라임을 반으로 잘라서 즙을 낸다\n" +
                        "구운 삼겹살에 라임즙을 뿌린다\n" +
                        "삼겹살과 감자를 함께 먹는다",
                "대구 달성군 구지면 창리로11길 93",
                mapOf(
                    "고기" to "2024.5,6",
                    "채소" to "2024.5,6",
                    "소스" to "2024.5,6"
                ),
                "개인 락앤락 통 필요함. 가져와주세요.",
                "https://i.namu.wiki/i/I9Ncl4-CLb7t5RlbVynbbLVOAbhFrqRcAW0jOJB0Pnc13PaCvqtXFEC9_0YPVtiHkRcSru6I2hXh5FSlBi8hb1efN0IFXLN22mDlUi2_6hx4n-leihCXL7C4rH-QIayJsMpv8cGp4eYILEEIdgbjmg.webp",
                4
            ),ShareData(
                "삼겹살",
                3,
                "준비물\n" +
                        "삼겹살(100g)\n" +
                        "마늘(10g)\n" +
                        "올리브유(5g)\n" +
                        "숯\n" +
                        "라임(1000g)\n" +
                        "감자(30g)\n" +
                        "후추(1g)\n" +
                        "소금(2g)\n" +
                        "\n" +
                        "삼겹살에 소금과 후추를 뿌린다\n" +
                        "마늘을 얇게 썬다\n" +
                        "감자를 껍질 벗기고 적당한 크기로 자른다\n" +
                        "감자에 소금과 올리브유를 뿌린다\n" +
                        "그릴에 숯을 넣고 불을 피운다\n" +
                        "숯이 적당히 달궈지면 삼겹살을 굽는다\n" +
                        "삼겹살이 반쯤 익으면 썰어둔 마늘을 넣는다\n" +
                        "삼겹살이 노릇노릇해질 때까지 굽는다\n" +
                        "감자를 그릴에 올려 굽는다\n" +
                        "삼겹살과 감자가 다 익으면 접시에 담는다\n" +
                        "라임을 반으로 잘라서 즙을 낸다\n" +
                        "구운 삼겹살에 라임즙을 뿌린다\n" +
                        "삼겹살과 감자를 함께 먹는다",
                "대구 달성군 구지면 창리로11길 93",
                mapOf(
                    "고기" to "2024.5,6",
                    "채소" to "2024.5,6",
                    "소스" to "2024.5,6"
                ),
                "개인 락앤락 통 필요함. 가져와주세요.",
                "https://i.namu.wiki/i/I9Ncl4-CLb7t5RlbVynbbLVOAbhFrqRcAW0jOJB0Pnc13PaCvqtXFEC9_0YPVtiHkRcSru6I2hXh5FSlBi8hb1efN0IFXLN22mDlUi2_6hx4n-leihCXL7C4rH-QIayJsMpv8cGp4eYILEEIdgbjmg.webp",
                4
            ),
        )
        return shareList
    }
}