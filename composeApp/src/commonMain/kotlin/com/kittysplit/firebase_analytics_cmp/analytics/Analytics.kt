package com.kittysplit.firebase_analytics_cmp.analytics

interface Analytics {
    fun init()
    fun logEvent(name: String, params: Map<String, String>?)
}
