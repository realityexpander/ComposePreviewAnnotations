package com.realityexpander.composepreviewannotations

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize

// material2
//import androidx.compose.material.MaterialTheme
//import androidx.compose.material.Surface
//import androidx.compose.material.Text
// material3
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewFontScale
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.realityexpander.composepreviewannotations.ui.theme.ComposePreviewAnnotationsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePreviewAnnotationsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background // material2
                    color = MaterialTheme.colorScheme.background // material3
                ) {
                    Greeting(
                        modifier = Modifier
//                            .background(MaterialTheme.colors.background), // material2
                            .background(MaterialTheme.colorScheme.background), // material3
                        "Previews"
                    )
                }
            }
        }
    }
}

//@PreviewFontScale
//@PreviewLightDark
@Preview
@Composable
fun Greeting(
    modifier: Modifier = Modifier,
    name: String = "hello"
) {
    ComposePreviewAnnotationsTheme {
        Surface {
            Text(
                text = "Hello $name!",
                modifier = modifier,
//                color = MaterialTheme.colors.primary,  // material2
                color = MaterialTheme.colorScheme.primary,  // material3
            )
        }
    }
}
