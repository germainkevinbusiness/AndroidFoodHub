package com.littlelemon.menu

class SortHelper {

    fun sortProducts(type: SortType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            SortType.Alphabetically -> productsList.sortAlphabetically()
            SortType.PriceAsc -> {
//                "create extension function for List<Product> with sorting based on price ascending"
                productsList.sortedBy { it.price }
            }

            SortType.PriceDesc -> {
//                "create extension function for List<Product> with sorting based on price descending"
                productsList.sortedByDescending { it.price }
            }
        }
    }

    private fun List<ProductItem>.sortAlphabetically(): List<ProductItem> {
        return sortedBy { it.title }
    }

}