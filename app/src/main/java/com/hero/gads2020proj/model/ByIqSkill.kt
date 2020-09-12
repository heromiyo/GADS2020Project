package com.hero.gads2020proj.model

import com.squareup.moshi.Json

data class ByIqSkill (
    @field:Json(name= "name") val name: String = "",
    @field:Json(name = "score") val score: Int = 0,
    @field:Json(name = "country") val country: String = "",
    @field:Json(name = "badgeUrl") val badgeUrl: String = ""
)