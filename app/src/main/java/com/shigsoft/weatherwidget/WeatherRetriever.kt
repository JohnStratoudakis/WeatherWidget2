package com.shigsoft.weatherwidget

import android.os.Bundle
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import java.net.HttpURLConnection
import java.net.URL


class WeatherRetriever(lat: Double, lon: Double) {
    fun loadZoneInfo() {
        //val url = "https://api.weather.gov/points/{self._lat},{self._lon}"
        val url = URL("https://api.weather.gov/points/")
//        val result = URL(url).readText()
//        System.out.println("Result: " + result)
//        val url = URL("http://www.google.com/")

        with(url.openConnection() as HttpURLConnection) {
            requestMethod = "GET"  // optional default is GET

            println("\nSent 'GET' request to URL : $url; Response Code : $responseCode")

            inputStream.bufferedReader().use {
                it.lines().forEach { line ->
                    println(line)
                }
            }
        }
    }
}