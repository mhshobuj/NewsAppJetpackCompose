package com.dma.newsappjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.dma.newsappjetpackcompose.presentation.onBorading.Page
import com.dma.newsappjetpackcompose.presentation.onBorading.component.onBoardingPage
import com.dma.newsappjetpackcompose.ui.theme.NewsAppJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            NewsAppJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                onBoardingPage(
                    page = Page(
                        title = "Lorem Ipsum is simply dummy",
                        description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                        image = R.drawable.onboarding1
                    )
                )
            }
        }
    }
}