package com.biniyam.questartbiniyam.response


// this file is derived from api JSON response and converted to kotlin classes

// this particular class contains the image url and website which is the most essential for the project.
data class Config(
    val iiif_url: String,
    val website_url: String
)