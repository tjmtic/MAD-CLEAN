package com.abyxcz.disneycodechallenge.example.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.abyxcz.disneycodechallenge.example.R

@Composable
fun InfoComponent(info: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_star_rate),
            contentDescription = null,
            modifier = Modifier
                .padding(
                    end = 2.dp,
                )
        )
        Text(text = info, style = MaterialTheme.typography.body2)
    }
}