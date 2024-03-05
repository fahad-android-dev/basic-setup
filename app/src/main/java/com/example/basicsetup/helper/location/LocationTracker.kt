package com.example.basicsetup.helper.location

import android.location.Location

interface LocationTracker {
    suspend fun getCurrentLocation(): Location?
}