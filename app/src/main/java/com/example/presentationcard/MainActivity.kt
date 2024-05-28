package com.example.presentationcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.presentationcard.ui.theme.PresentationCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PresentationCardTheme {
                PresentationCard(modifier = Modifier)
            }
        }
    }
}

@Composable
fun PresentationCard(modifier: Modifier = Modifier) {
    Box {
        Column(modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
            PresentationCardHeader(modifier = Modifier)
            PresentationCardBody(modifier = Modifier)
        }
    }
}

@Composable
fun PresentationCardHeader(modifier: Modifier) {
    Column(
        modifier
            .fillMaxWidth()
            .padding(top = 300.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = stringResource(R.string.image_description),
            modifier
                .width(110.dp)
                .height(110.dp)
        )
        Text(
            text = stringResource(R.string.name),
            fontSize = 40.sp
        )
        Text(
            text = stringResource(R.string.title),
            fontSize = 24.sp
        )
    }
}

@Composable
fun PresentationCardBody(modifier: Modifier) {
    Column(
        modifier
            .padding(bottom = 100.dp)
            .fillMaxWidth()
            .wrapContentWidth(),
    ) {
        Row {
            Icon(imageVector = Icons.Default.Call, contentDescription = null)
            Spacer(modifier.width(16.dp))
            Text(text = stringResource(R.string.phone_number))
        }
        Spacer(modifier.height(8.dp))
        Row {
            Icon(imageVector = Icons.Default.Email, contentDescription = null)
            Spacer(modifier.width(16.dp))
            Text(text = stringResource(R.string.email))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PresentationCardTheme {
        PresentationCard(modifier = Modifier)
    }
}