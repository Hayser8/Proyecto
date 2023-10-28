package com.example.proyectoplatsreal.ui.ajustes

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
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectoplatsreal.R
import com.example.proyectoplatsreal.ui.theme.darkbackground
import com.example.proyectoplatsreal.ui.theme.secondarydark

@Composable
fun AjustesScreen(isDarkMode: Boolean, onDarkModeChange: (Boolean) -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(dimensionResource(id = R.dimen.global_padding)),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Título "Ajustes"
            Text(
                text = stringResource(id = R.string.settings_title),
                color = MaterialTheme.colorScheme.onBackground,
                fontSize = dimensionResource(id = R.dimen.large_text).value.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.global_spacing)))

            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = stringResource(id = R.string.logo_content_description),
                modifier = Modifier.size(dimensionResource(id = R.dimen.logo_size).value.dp)
            )

            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.global_spacing)))

            Divider(color = MaterialTheme.colorScheme.secondary)

            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.medium_spacing)))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = stringResource(id = R.string.dark_mode_label),
                    color = MaterialTheme.colorScheme.onBackground,
                    fontSize = dimensionResource(id = R.dimen.medium_text).value.sp
                )

                Switch(
                    checked = isDarkMode,
                    onCheckedChange = onDarkModeChange,
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Color.Green,
                        uncheckedThumbColor = MaterialTheme.colorScheme.onSurface
                    )
                )
            }

            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.medium_spacing)))

            Divider(color = MaterialTheme.colorScheme.secondary)
        }
    }
}



