package com.biniyam.questartbiniyam.response

// this file is derived from api JSON response and converted to kotlin classes

// this class enables to page through art works using next and previous page buttons, if needed
data class Pagination(
    val current_page: Int,
    val limit: Int,
    val next_url: String,
    val offset: Int,
    val total: Int,
    val total_pages: Int
)