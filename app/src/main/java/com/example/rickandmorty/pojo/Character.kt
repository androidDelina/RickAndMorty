package com.example.rickandmorty.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Character(
    @SerializedName("id")
    @Expose
    val id: Int? = null,

    @SerializedName("name")
    @Expose
    val name: String? = null,

    @SerializedName("status")
    @Expose
    val status: String? = null,

    @SerializedName("image")
    @Expose
    val imageUrl: String? = null,

    @SerializedName("location")
    @Expose
    val location: Location? = null,

    @SerializedName("episode")
    @Expose
    val episode: List<Episode>? = null
)
