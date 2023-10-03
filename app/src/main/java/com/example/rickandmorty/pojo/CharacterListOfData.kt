package com.example.rickandmorty.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CharacterListOfData(

    @SerializedName("results")
    @Expose
    val listOfCharacters: List<Character>? = null
)
