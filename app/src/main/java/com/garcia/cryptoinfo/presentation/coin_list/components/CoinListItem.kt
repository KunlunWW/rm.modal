package com.garcia.cryptoinfo.presentation.coin_list.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import coil.decode.SvgDecoder
import com.garcia.cryptoinfo.common.Constants.CHART_7DAYS
import com.garcia.cryptoinfo.common.Constants.CHART_BASE_URL
import com.garcia.cryptoinfo.common.Constants.COIN_LOGO_BASE_URL
import com.garcia.cryptoinfo.common.Constants.LOGO_PNG
import com.garcia.cryptoinfo.domain.model.Coin

@OptIn(ExperimentalCoilApi::class)
@Composable
fun CoinListItem(
    coin: Coin,
    onItemClick: (Coin) -> Unit
) {
   