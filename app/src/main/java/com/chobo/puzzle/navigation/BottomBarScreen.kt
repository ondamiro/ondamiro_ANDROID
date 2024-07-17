package com.chobo.puzzle.navigation

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.chobo.puzzle.R
import com.chobo.puzzle.navigation.BottomBar

@Composable
fun BottomBarScreen(
    navController: NavHostController,
) {
    val items = listOf(
        BottomBar.Together,
        BottomBar.Share,
        BottomBar.Keep,
        BottomBar.Mypage
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    BottomNavigation(
        backgroundColor = Color.White,
        contentColor = Color(0xFF3F414E)
    ) {
        items.forEach { item ->
            BottomNavigationItem(
                icon = {
                    val iconColor = if (currentRoute == item.rout) Color(0xffFF462D) else Color(0xffBCBCBC)
                    Icon(
                        ImageVector.vectorResource(id = item.icon),
                        contentDescription = item.label,
                        tint = iconColor, // Use tint to dynamically change icon color
                        modifier = Modifier.width(26.dp).height(26.dp)
                    )
                },
                selected = currentRoute == item.rout,
                alwaysShowLabel = false,
                onClick = {
                    navController.navigate(item.rout) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}
