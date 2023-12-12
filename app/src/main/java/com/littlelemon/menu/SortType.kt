package com.littlelemon.menu

sealed interface SortType {
    object Alphabetically : SortType
    object PriceAsc : SortType
    object PriceDesc : SortType
}
