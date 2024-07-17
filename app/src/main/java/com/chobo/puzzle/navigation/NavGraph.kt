package com.chobo.puzzle.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.chobo.puzzle.keep.KeepScreen
import com.chobo.puzzle.MyScreen
import com.chobo.puzzle.together.TogetherScreen
import com.chobo.puzzle.keep.KeepDatas
import com.chobo.puzzle.keep.StorageMethodScreen
import com.chobo.puzzle.share.Screen.RecipeScreen
import com.chobo.puzzle.share.ShareDatas
import com.chobo.puzzle.share.Screen.ShareScreen
import com.chobo.puzzle.together.BuyScreen
import com.chobo.puzzle.together.TogetherDatas
import com.chobo.puzzle.user.UserData
import com.chobo.puzzle.user.UserDatass

@Composable
fun NavigationGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController = navController, startDestination = "Share", modifier = modifier) {
        composable("Together") {
            TogetherScreen(Togethers = TogetherDatas.getTogether(), navController = navController, userData = UserDatass.userData)
        }
        composable("Share") {
            ShareScreen(cards = ShareDatas.getShare(), navController = navController)
        }
        composable("Keep") {
            KeepScreen(keeps = KeepDatas.getKeep(), navController = navController)
        }
        composable("Mypage") {
            MyScreen(User = UserDatass.userData)
        }

        composable("Recipe/{title}") { backStackEntry ->
            val title = backStackEntry.arguments?.getString("title") ?: ""
            RecipeScreen(title = title, cards = ShareDatas.getShare(), navController = navController)
        }
        composable("StorageMethod/{title}") { backStackEntry ->
            val title = backStackEntry.arguments?.getString("title") ?: ""
            StorageMethodScreen(keeps = KeepDatas.getKeep(), title = title, navController = navController)
        }
        composable("BuyPage/{title}") { backStackEntry ->
            val title = backStackEntry.arguments?.getString("title") ?: ""
            BuyScreen(togethers = TogetherDatas.getTogether(), title = title, userData = UserDatass.userData, navController = navController)
        }
    }
}
