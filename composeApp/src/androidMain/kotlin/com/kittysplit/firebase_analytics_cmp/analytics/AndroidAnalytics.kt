package com.kittysplit.firebase_analytics_cmp.analytics

import androidx.core.os.bundleOf
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase

class AndroidAnalytics() : Analytics {
    private lateinit var firebaseAnalytics: FirebaseAnalytics

    override fun init() {
        firebaseAnalytics = Firebase.analytics
    }

    override fun logEvent(
        name: String,
        params: Map<String, String>?
    ) {
        val args = params
            ?.map { it.key to it.value }
            ?.toTypedArray()
            ?.let { bundleOf(*it) }

        firebaseAnalytics.logEvent(name, args)
    }
}
