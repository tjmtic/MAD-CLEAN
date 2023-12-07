package com.abyxcz.disneycodechallenge.example.presentation.screen.home

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.abyxcz.disneycodechallenge.example.presentation.components.ButtonComponent
import com.abyxcz.disneycodechallenge.example.presentation.components.PopupComponent
import com.abyxcz.disneycodechallenge.example.R

@Composable
fun HomeBottomBar( text: String,
                   onClickButton: () -> Unit = { },
                   enabled: Boolean = false,
                   onClickPopup: () -> Unit = { },
                   displayPopup: Boolean = false
) {
            //May display action button or popup dialog
            if (!displayPopup)
            ButtonComponent(text, onClickButton, enabled)
            else
            PopupComponent(title = stringResource(id = R.string.reservation_needed),
                           text = stringResource(id = R.string.select_at_least_one),
                           onIconClick = { onClickPopup() })

}

