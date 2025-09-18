package com.kittysplit.firebase_analytics_cmp.analytics

import org.koin.core.module.Module
import org.koin.dsl.module

actual fun analyticsModule(): Module = module {
    single<Analytics> {
        val analytics = AndroidAnalytics()
        analytics.init()
        analytics
    }
}
