package com.biniyam.questartbiniyam.response

data class SuggestAutocompleteAll(
    val contexts: Contexts,
    val input: List<String>,
    val weight: Int
)