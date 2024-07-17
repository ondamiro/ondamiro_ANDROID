package com.chobo.puzzle.keep

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun KeepScreen(
    keeps: List<KeepData>,
    navController: NavHostController,
) {
    Row {
        LazyColumn {
            items(keeps) { keepData ->
                KeepSard(
                    KeepsData = keepData,
                    onClick = {
                        navController.navigate("StorageMethod/${keepData.titl}")
                    }
                )
            }
        }
    }
}
