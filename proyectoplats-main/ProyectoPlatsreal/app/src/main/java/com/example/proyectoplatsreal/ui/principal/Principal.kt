package com.example.proyectoplatsreal.ui.principal

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.example.proyectoplatsreal.R
import com.example.proyectoplatsreal.ui.theme.darkbackground


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val imageList = listOf(
        R.drawable.rap,
        R.drawable.pop,
        R.drawable.blues,
        R.drawable.mexican
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(dimensionResource(R.dimen.global_padding)), // Usando dimens
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            OutlinedTextField(
                value = remember { mutableStateOf("") }.value,
                onValueChange = { /* TODO: handle text change */ },
                label = { Text(stringResource(R.string.search_placeholder), color = Color.White) },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(dimensionResource(R.dimen.search_field_height)), // Usando dimens
                trailingIcon = { Icon(Icons.Default.Search, contentDescription = stringResource(R.string.search_icon_description), tint = Color.White) },
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Search
                ),
                textStyle = androidx.compose.ui.text.TextStyle(color = Color.White),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.White,
                    unfocusedBorderColor = Color.White
                )
            )
            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.field_spacing))) // Usando dimens

            LazyColumn(
                contentPadding = PaddingValues(dimensionResource(R.dimen.list_content_padding).value.dp) // Usando dimens
            ) {
                items(imageList.chunked(2)) { rowImages ->
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        rowImages.forEach { imageRes ->
                            Image(
                                painter = painterResource(id = imageRes),
                                contentDescription = null,
                                modifier = Modifier
                                    .weight(1f)
                                    .clickable { /* Handle click */ }
                                    .padding(dimensionResource(R.dimen.list_item_padding)) // Usando dimens
                                    .aspectRatio(1f),
                                contentScale = ContentScale.Crop
                            )
                        }
                    }
                }
            }
        }
    }
}



