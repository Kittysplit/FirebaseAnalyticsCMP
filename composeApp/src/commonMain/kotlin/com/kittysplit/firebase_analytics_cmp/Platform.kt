package com.kittysplit.firebase_analytics_cmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform