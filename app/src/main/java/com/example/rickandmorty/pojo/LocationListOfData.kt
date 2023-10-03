package com.example.rickandmorty.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class LocationListOfData(

    @SerializedName("results")
    @Expose
    val listOfLocations: List<Location>? = null
)
