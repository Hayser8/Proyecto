package com.example.proyectoplatsreal.ui.playlists

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectoplatsreal.R
import com.example.proyectoplatsreal.ui.theme.darkbackground
import com.example.proyectoplatsreal.ui.theme.darkbase

@Composable
fun PlaylistsScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(dimensionResource(R.dimen.global_padding)) // Usando dimens
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = stringResource(R.string.playlists_title),
                    color = Color.White,
                    fontSize = dimensionResource(R.dimen.title_text_size).value.sp, // Usando dimens
                    fontWeight = FontWeight.Bold
                )
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Logo",
                    modifier = Modifier.size(dimensionResource(R.dimen.logo_size)) // Usando dimens
                )
            }

            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.global_spacing))) // Usando dimens

            listOf("Género", "Idioma", "Artista").forEach { title ->
                FilterSection(title = title)
                Spacer(modifier = Modifier.height(dimensionResource(R.dimen.between_filters_spacing))) // Usando dimens
            }

            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.button_spacing))) // Usando dimens

            Button(
                onClick = { /* Acción para generar */ },
                colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = stringResource(R.string.generate_button), color = Color.White)
            }

            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.button_spacing))) // Usando dimens
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FilterSection(title: String) {
    Column {

        Text(
            text = title,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = dimensionResource(R.dimen.filter_title_text_size).value.sp // Usando dimens
        )

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.between_filter_items_spacing))) // Usando dimens

        OutlinedTextField(
            value = "",
            onValueChange = { /* Actualizar estado */ },
            placeholder = {
                Text(text = stringResource(R.string.filter_placeholder, title), color = Color.Gray)
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.White,
                unfocusedBorderColor = Color.White,
                cursorColor = Color.White,
                textColor = Color.White,
            ),
            textStyle = TextStyle(color = Color.White),
            modifier = Modifier.fillMaxWidth()
        )
    }
}



