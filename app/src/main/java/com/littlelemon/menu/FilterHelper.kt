package com.littlelemon.menu

class FilterHelper {
    //TODO create a FilterHelperTest and write a unit test for filterProducts

    fun filterProducts(type: FilterType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            FilterType.All -> productsList
            FilterType.Dessert -> {
                //"only products with category equal to Dessert"
                productsList.filter { it.category == "Dessert" }
            }

            FilterType.Drinks -> {
                // "only products with category equal to Drinks"
                productsList.filter { it.category == "Drinks" }
            }

            FilterType.Food -> {
                // "only products with category equal to Food"
                productsList.filter { it.category == "Food" }
            }
        }
    }

}