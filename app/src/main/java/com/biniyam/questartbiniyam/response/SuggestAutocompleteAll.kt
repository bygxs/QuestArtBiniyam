package com.biniyam.questartbiniyam.response


// this file is derived from api JSON response and converted to kotlin classes
data class SuggestAutocompleteAll(
    val contexts: Contexts,
    val input: List<String>,
    val weight: Int
)