package com.lelestacia.explore.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.lelestacia.common.ui.theme.purpleBlue

@Composable
fun HorizontalAnimeFooterLoading(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(all = 16.dp)
            .background(Color.Black),
        verticalArrangement = Arrangement.Center
    ) {
        CircularProgressIndicator(
            color = purpleBlue
        )
    }
}