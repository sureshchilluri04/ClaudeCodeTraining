package com.example.claudecodetraining

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.claudecodetraining.ui.theme.ClaudeCodeTrainingTheme

/**
 * Single-activity entry point for the app, hosting the Compose UI tree.
 *
 * TODO: Wire up a NavHost (navigation-compose) once more than one screen exists.
 * TODO: Introduce a DI setup (e.g. Hilt) instead of constructing dependencies inline.
 * TODO: Move UI state out of composables and into ViewModels as screens grow.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ClaudeCodeTrainingTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

/**
 * Displays a simple greeting message.
 *
 * @param name The name to greet.
 * @param modifier [Modifier] applied to the underlying [Text].
 *
 * TODO: Replace hardcoded "Hello $name!" with a string resource for localization.
 * TODO: Move this composable to its own file once more UI components are added.
 */
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

/**
 * Preview of [Greeting] rendered with a sample name.
 *
 * TODO: Add dark theme and multi-locale preview variants.
 */
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ClaudeCodeTrainingTheme {
        Greeting("Android")
    }
}