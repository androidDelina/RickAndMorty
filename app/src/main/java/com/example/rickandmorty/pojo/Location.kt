package com.example.rickandmorty.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Location(
    @SerializedName("id")
    @Expose
    val id: Int? = null,

    @SerializedName("name")
    @Expose
    val name: String? = null,

    @SerializedName("type")
    @Expose
    val type: String? = null,

    @SerializedName("dimension")
    @Expose
    val dimension: String? = null,

    @SerializedName("residents")
    @Expose
    val residents: List<Character>? = null
)
