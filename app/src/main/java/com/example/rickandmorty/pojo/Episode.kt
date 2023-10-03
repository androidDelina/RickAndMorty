package com.example.rickandmorty.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Episode (
    @SerializedName("id")
    @Expose
    val id: Int? = null,

    @SerializedName("name")
    @Expose
    val name: String? = null,

    @SerializedName("air_date")
    @Expose
    val air_date: String? = null,

    @SerializedName("episode")
    @Expose
    val episode: String? = null,

    @SerializedName("characters")
    @Expose
    val characters: List<Character>? = null
)