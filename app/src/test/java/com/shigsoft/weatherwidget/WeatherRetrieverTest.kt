package com.shigsoft.weatherwidget

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class WeatherRetrieverTest {
    @Test
    fun test_ftoi() {
        // GIVEN
        val lat_flushing = 40.7607
        val lon_flushing = -73.7873

        println("lat:" + lat_flushing)
    }
    @Test
    fun addition_isCorrect() {
        // GIVEN
        val lat_flushing = 40.7607
        val lon_flushing = -73.7873

        // WHEN
        val weatherRetriever = WeatherRetriever(lat_flushing, lon_flushing)
        weatherRetriever.loadZoneInfo()

    }
}