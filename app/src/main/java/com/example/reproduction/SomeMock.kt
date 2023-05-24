package com.example.reproduction

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SomeMock(
    val aaaa: String
)
