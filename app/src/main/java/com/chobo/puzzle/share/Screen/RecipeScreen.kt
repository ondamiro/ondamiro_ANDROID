package com.chobo.puzzle.share.Screen


import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.chobo.puzzle.R
import com.chobo.puzzle.share.ShareData

@Composable
fun RecipeScreen(
    title: String,
    cards: List<ShareData>,
    navController: NavHostController,
){
    Column {
        Row(modifier = Modifier
            .fillMaxWidth(1f)
            .height(35.dp)
            .background(color = Color(0xffFF462D))
            .fillMaxWidth(1f)
            .height(35.dp)
        ){
            IconButton(onClick = { navController.navigate("Share") },
                modifier = Modifier
                    .padding(start = 13.dp, top = 10.dp)
            ) {
                Icon(painterResource(id = R.drawable.back), contentDescription = null )
            }
            Text(text = "음식 보기", Modifier.padding(start = 5.dp), color = Color.White)
        }

        Column (
            modifier = Modifier
                .background(color = Color((0xffFBF9F9)))
                .fillMaxHeight(1f)
                .width(305.dp)
        ){
            val filteredCards = cards.filter { it.titl == title }.first()

            Column (
                modifier = Modifier
                    .background(color = Color.White)
                    .fillMaxHeight(1f)
                    .width(305.dp)
            ){
                AsyncImage(
                    modifier = Modifier
                        .width(122.dp)
                        .height(75.dp),
                    model = filteredCards.foodImg,
                    contentDescription = null,
                )
                Row {
                    Text(text = filteredCards.titl)
                    Text(text = filteredCards.time.toString() + "분 전")
                    Text(text = filteredCards.eat.toString()+"인분", color = Color(0xffFF462D))
                    Text(text = "나눔")
                }
                Text(text = filteredCards.address)
                Text(text = filteredCards.data.entries.joinToString("\n") { (key, value) ->
                    "$key($value)"
                })
                Text(text = "레시피")

                Box(
                    modifier = Modifier
                        .background(color = Color(0xffFBF9F9))
                        .width(270.dp)
                        .height(210.dp)
                        .verticalScroll(rememberScrollState())
                ) {
                    Text(
                        text = filteredCards.recipe,
//                    modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }
    }
}


