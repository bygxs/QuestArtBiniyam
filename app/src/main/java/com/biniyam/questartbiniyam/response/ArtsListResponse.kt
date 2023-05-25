package com.biniyam.questartbiniyam.response


// this file is derived from api JSON response and converted to kotlin classes
data class ArtsListResponse(
    val config: Config,
    val `data`: List<Data>,
    val info: Info,
    val pagination: Pagination
)