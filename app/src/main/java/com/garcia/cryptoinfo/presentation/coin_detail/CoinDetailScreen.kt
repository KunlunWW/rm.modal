package com.garcia.cryptoinfo.presentation.coin_detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import coil.decode.SvgDecoder
import com.garcia.cryptoinfo.common.Constants
import com.garcia.cryptoinfo.presentation.coin_detail.components.CoinTag
import com.garcia.cryptoinfo.presentation.coin_detail.components.TeamListItem
import com.google.accompanist.flowlayout.FlowRow

@OptIn(ExperimentalCoilApi::class)
@Preview
@Composable
fun CoinDetailScreen(
    viewModel: CoinDetailViewModel = hiltViewModel()
){
    val state = viewModel.state.value
    Box(modifier = Modifier.fillMaxSize()){
        state.coin?.let { coin ->
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(20.dp)
            ) {
                item {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Row(
                            modifier = Modifier.weight(8f)
                        ) {
                            Image(
                                painter = rememberImagePainter(
                                    "${Constants.COIN_LOGO_BASE_URL}${coin.coinId}${Constants.LOGO_PNG}",
                                    builder = {
                                        crossfade(true)
                                    }
                                ),
                                contentDescription = null,
                                modifier = Modifier.size(50.dp)
                            )
                            Text(
                                text = "${coin.rank} - ${coin.name} (${coin.symbol})",
                                style = MaterialTheme.typography.h2,
                                overflow = TextOverflow.Ellipsis,
                                maxLines = 2,
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .padding(start = 12.dp)
                            )
                        }
                        val status = "${if(coin.isNew) "New ${coin.type}! -" else ""} ${if(coin.isActive) "Active" else 