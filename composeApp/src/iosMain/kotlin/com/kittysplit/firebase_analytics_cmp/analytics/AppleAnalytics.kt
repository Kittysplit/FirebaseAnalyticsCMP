package com.kittysplit.firebase_analytics_cmp.analytics

import FirebaseAnalytics.FIRAnalytics
import FirebaseCore.FIRApp

class AppleAnalytics : Analytics {
    
    private val firAnalytics: FIRAnalytics.Companion = FIRAnalytics

    override fun init() {
        FIRApp.configure()
    }

    override fun logEvent(
        name: String,
        params: Map<String, String>?
    ) {
        firAnalytics.logEventWithName(name, params as Map<Any?, *>?)
    }
}
