package com.chobo.puzzle.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.chobo.puzzle.keep.KeepScreen
import com.chobo.puzzle.MyScreen
import com.chobo.puzzle.TogetherScreen
import com.chobo.puzzle.share.Screen.RecipeScreen
import com.chobo.puzzle.share.ShareDatas
import com.chobo.puzzle.share.Screen.ShareScreen

@Composable
fun NavigationGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController = navController, startDestination = "Share", modifier = modifier) {
        composable("Together") {
            TogetherScreen()
        }
        composable("Share") {
            ShareScreen(cards = ShareDatas.getShare(), navController = navController)
        }
        composable("Keep") {
            KeepScreen()
        }
        composable("Mypage") {
            MyScreen()
        }

        composable("Recipe/{title}") { backStackEntry ->
            val title = backStackEntry.arguments?.getString("title") ?: ""
            RecipeScreen(title = title, cards = ShareDatas.getShare(), navController = navController)
        }
    }
}
