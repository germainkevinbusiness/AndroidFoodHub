package com.littlelemon.menu

sealed interface FilterType {
    object All : FilterType
    object Drinks : FilterType
    object Food : FilterType
    object Dessert : FilterType
}
