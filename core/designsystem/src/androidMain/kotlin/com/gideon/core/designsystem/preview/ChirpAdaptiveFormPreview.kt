package com.gideon.core.designsystem.preview

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices.NEXUS_10
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import com.gideon.core.designsystem.components.brand.ChirpBrandLogo
import com.gideon.core.designsystem.components.layouts.ChirpAdaptiveFormLayout
import com.gideon.core.designsystem.theme.ChirpTheme

@Composable
@PreviewScreenSizes
@Preview(
    device =NEXUS_10
)
fun ChirpAdaptiveFormLayoutLightPreview() {
    ChirpTheme {
        ChirpAdaptiveFormLayout(
            headerText = "Welcome to Chipr!",
            errorText = "Login failed",
            logo = { ChirpBrandLogo() },
            formContent = {
                Text(
                    text = "Sample fom title",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Text(
                    text = "Sample fom title 2",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
        )
    }
}
@Composable
@Preview()
fun ChirpAdaptiveFormLayoutDarkPreview() {
    ChirpTheme(
        darkTheme = true
    ) {
        ChirpAdaptiveFormLayout(
            headerText = "Welcome to Chipr!",
            errorText = "Login failed",
            logo = { ChirpBrandLogo() },
            formContent = {
                Text(
                    text = "Sample fom title",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Text(
                    text = "Sample fom title 2",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
        )
    }
}