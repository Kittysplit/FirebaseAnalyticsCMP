package com.kittysplit.firebase_analytics_cmp.analytics

import org.koin.dsl.module

fun noopAnalyticsModule() = module {
    single<Analytics> {
        object : Analytics {
            override fun init() {}

            override fun logEvent(name: String, params: Map<String, String>?) {}
        }
    }
}
