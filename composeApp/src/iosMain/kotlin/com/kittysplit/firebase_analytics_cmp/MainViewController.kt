package com.kittysplit.firebase_analytics_cmp

import androidx.compose.ui.window.ComposeUIViewController
import com.kittysplit.firebase_analytics_cmp.analytics.analyticsModule
import org.koin.compose.KoinApplication

fun MainViewController() = ComposeUIViewController {
    KoinApplication(application = {
        modules(analyticsModule())
    }) { App() }
}
