package com.abyxcz.disneycodechallenge.example.presentation.screen.confirm

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.abyxcz.disneycodechallenge.example.presentation.screen.conflict.ConflictTopBar
import com.abyxcz.disneycodechallenge.example.ui.theme.AppContentColor
import com.abyxcz.disneycodechallenge.example.ui.theme.AppThemeColor


@Composable
fun ConflictScreen(
    onBackPressed: () -> Unit,
) {
    Scaffold(
        topBar={
               ConflictTopBar({onBackPressed()})
        },
        contentColor = MaterialTheme.colors.AppContentColor,
        backgroundColor = MaterialTheme.colors.AppThemeColor,
        content = {

        })
}

