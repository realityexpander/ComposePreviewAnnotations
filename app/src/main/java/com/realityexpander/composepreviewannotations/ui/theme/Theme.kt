package com.realityexpander.composepreviewannotations.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape

// material2
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
// material3
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Shapes
//import androidx.compose.material3.Typography
//import androidx.compose.material3.darkColorScheme
//import androidx.compose.material3.dynamicDarkColorScheme
//import androidx.compose.material3.dynamicLightColorScheme
//import androidx.compose.material3.lightColorScheme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ComposePreviewAnnotationsTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+ // material3
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        darkColors( // materials2
//        darkColorScheme(  // material3
//            primary = Color(0xFF0059CB),
            primary = Color.Red,
            // onPrimary = Color(0xFFBBBBBB),
            onPrimary = Color(0xFFDDDDDD),
            secondary = Color(0xFF4cb2a2),
            onSecondary = Color(0xFFDDDDDD),
            // tertiary = Color(0xFF3700B3) // material3
            surface = Color(0xFF000000),
//            surface = Color.Blue,
            onSurface = Color(0xFFBBBBBB),
            background = Color(0xFF333344),
//            background = Color(0xFF333344),
            onBackground = Color(0xFFDDDDDD),
            onError = Color(0xFF222222),
            error = Color(0xFFFF0000)
        )
    } else {
        lightColors( // material2
//        lightColorScheme( // material3
            primary = Color(0xFF0089FB),
//            primary = Color.Red,
            onPrimary = Color(0xFFFFFFFF),
            secondary = Color(0xFF00917d),
            onSecondary = Color(0xFFFFFFFF),
            // tertiary = Color(0xFF3700B3)
//            surface = Color(0xFFCCCCCC),
            surface = Color.Blue,
            onSurface = Color(0xFF000000),
            background = Color(0xFF444444),
            onBackground = Color(0xFFDDDDDD),
            onError = Color(0xFF222222),
            error = Color(0xFFFF0000)
        )
    }
    val typography = Typography(
        body2 = TextStyle( // material2
//        bodyMedium = TextStyle( // material3
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        ),
    )
    val shapes = Shapes(
        small = RoundedCornerShape(4.dp),
        medium = RoundedCornerShape(8.dp),
        large = RoundedCornerShape(0.dp)
    )

    MaterialTheme(
        colors = colors, // material2
//        colorScheme = when { // material3
//            dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
//                val context = LocalContext.current
//                if (darkTheme)
//                    dynamicDarkColorScheme(context)
//                else
//                    dynamicLightColorScheme(context)
//            }
//            else -> colors
//        },
        typography = typography,
        shapes = shapes,
        content = content
    )
}
