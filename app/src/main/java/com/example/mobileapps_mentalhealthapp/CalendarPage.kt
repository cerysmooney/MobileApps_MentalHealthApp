package com.example.mobileapps_mentalhealthapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mobileapps_mentalhealthapp.ui.theme.MobileApps_MentalHealthAppTheme

class CalendarPage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobileApps_MentalHealthAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting5("Android")
                }
            }
        }

        setContentView(R.layout.calendar_page)

        val reflectionPageButton = findViewById<Button>(R.id.buttonReflectionPage)
        reflectionPageButton.setOnClickListener{
            val Intent = Intent(this, ReflectionPage::class.java)
            startActivity(Intent)
        }
    }
}

@Composable
fun Greeting5(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! calendar",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview5() {
    MobileApps_MentalHealthAppTheme {
        Greeting5("Olivia")
    }
}