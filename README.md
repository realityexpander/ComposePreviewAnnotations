# New Preview Annotations

## `@PreviewLightDark`
- Previews dark and light mode
  
   [<img src="https://github.com/realityexpander/ComposePreviewAnnotations/assets/5157474/e95eb5bf-11d6-49a6-88d8-a9c7c2302dab" width="200">]()

## `@PreviewFontScale`
- Previews various scales of fonts

  [<img src="https://github.com/realityexpander/ComposePreviewAnnotations/assets/5157474/81fcd81d-4d3f-4b77-8f6f-7bc3d0a3dd4b" width="200">]()

- How to Add to Android Project
  - ```
    // build.gradle.kts (:app)
    dependencies {
     // Add Custom Previews
     debugImplementation("androidx.compose.ui:ui-tooling-preview:1.6.0")
    }
    ```
    
- How to Add to KMP Project
- - ```
    // build.gradle.kts (:shared)
    // at bottom of file in block by itself:
    dependencies {
        // For Compose previews in Android
        debugImplementation(libs.androidx.ui.tooling.preview.v160)
    }

    // build.gradle.kts (:androidApp)
    // dependencies {
        implementation(libs.androidx.compose.ui)
        implementation(libs.androidx.compose.ui.tooling.preview)
    }
    ```

## Issues Found:
- Preview using Material 3 does not apply Theme?
- Works fine in Material 2

## Bonus:
- How it works
- How you can make your own custom annotations
