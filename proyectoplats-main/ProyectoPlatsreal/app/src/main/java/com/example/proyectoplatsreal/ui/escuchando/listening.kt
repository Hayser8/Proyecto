package com.example.proyectoplatsreal.ui.escuchando

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectoplatsreal.R
import com.example.proyectoplatsreal.ui.theme.darkbackground
import com.example.proyectoplatsreal.ui.theme.darkbase
import com.example.proyectoplatsreal.ui.theme.secondarydark

@Composable
fun ListeningScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(dimensionResource(R.dimen.global_padding)), // Usando dimens
            horizontalAlignment = Alignment.Start
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stringResource(R.string.listening_title),
                    style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                    color = Color.White
                )

                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = stringResource(R.string.logo_content_desc),
                    modifier = Modifier.size(dimensionResource(R.dimen.logo_size)) // Usando dimens
                )
            }

            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.medium_spacing))) // Usando dimens

            Button(
                onClick = {
                    navController.navigate(com.example.proyectoplatsreal.navigation.Screen.PublishSongScreen.route)
                },
                colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary),
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(
                    text = stringResource(R.string.publish_prompt),
                    color = Color.White
                )
            }

            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.global_spacing))) // Usando dimens

            Text(
                text = stringResource(R.string.feed_title),
                style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold),
                color = Color.White
            )

            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.small_spacing))) // Usando dimens

            Divider(color = MaterialTheme.colorScheme.secondary)

            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.small_spacing))) // Usando dimens

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.malumababy),
                    contentDescription = null,
                    modifier = Modifier.size(dimensionResource(R.dimen.image_size_large)) // Usando dimens
                )

                Spacer(modifier = Modifier.width(dimensionResource(R.dimen.filter_spacing))) // Usando dimens

                Column {
                    Text(
                        text = stringResource(R.string.maluma_song_title),
                        style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold),
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.height(dimensionResource(R.dimen.song_info_spacing))) // Usando dimens

                    Text(
                        text = stringResource(R.string.maluma_song_link),
                        color = Color.White,
                        textDecoration = TextDecoration.Underline,
                        modifier = Modifier.clickable { /* Handle click action to open link */ }
                    )

                    Spacer(modifier = Modifier.height(dimensionResource(R.dimen.song_info_spacing))) // Usando dimens

                    Row {
                        repeat(5) {
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = null,
                                tint = Color.Yellow
                            )
                            Spacer(modifier = Modifier.width(dimensionResource(R.dimen.star_icon_spacing))) // Usando dimens
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.filter_spacing))) // Usando dimens
        }
    }
}



