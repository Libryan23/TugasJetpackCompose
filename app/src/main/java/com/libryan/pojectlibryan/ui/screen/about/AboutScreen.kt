package com.libryan.pojectlibryan.ui.screen.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.libryan.pojectlibryan.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(
    modifier: Modifier = Modifier,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(R.string.title_about)) },
            )
        },
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .fillMaxSize()
                .padding(it),
        ) {
            Image(
                painter = painterResource(id = R.drawable.adikkkk),
                contentDescription = stringResource(R.string.author),
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .padding(16.dp)
                    .size(128.dp)
                    .clip(shape = RoundedCornerShape(8.dp)),
            )
            Text(
                text = stringResource(id = R.string.author),
                style = MaterialTheme.typography.titleLarge,
                modifier = modifier.padding(4.dp),
            )
            Text(
                text = stringResource(id = R.string.author_email),
                style = MaterialTheme.typography.bodyLarge,
                modifier = modifier.padding(4.dp),
            )
            Text(
                text = stringResource(id = R.string.perguruan_tinggi),
                style = MaterialTheme.typography.bodyLarge,
                modifier = modifier.padding(4.dp),
            )
            Text(
                text = stringResource(id = R.string.Jurusan),
                style = MaterialTheme.typography.bodyLarge,
                modifier = modifier.padding(4.dp),
            )
        }
    }
}