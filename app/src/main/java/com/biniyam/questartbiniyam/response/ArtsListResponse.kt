package com.biniyam.questartbiniyam.response

data class ArtsListResponse(
    val config: Config,
    val `data`: List<Data>,
    val info: Info,
    val pagination: Pagination
)