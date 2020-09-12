package com.hero.gads2020proj.model

import com.squareup.moshi.Json

data class ByHour (
    @field:Json(name= "name") val name: String = "",
    @field:Json(name = "hours") val hours: Int = 0 ,
    @field:Json(name = "country") val country: String = "",
    @field:Json(name = "badgeUrl") val badgeUrl: String = ""
)