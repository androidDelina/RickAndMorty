package com.example.rickandmorty.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class EpisodeListOfData(

    @SerializedName("results")
    @Expose
    val listOfEpisodes: List<Episode>? = null
)
