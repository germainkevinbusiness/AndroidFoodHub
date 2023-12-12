package com.littlelemon.menu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.littlelemon.PRODUCT_CATEGORY
import com.littlelemon.PRODUCT_IMAGE
import com.littlelemon.PRODUCT_PRICE
import com.littlelemon.PRODUCT_TITLE

class ProductActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val title = intent?.getStringExtra(PRODUCT_TITLE) ?: ""
        val price = intent?.getDoubleExtra(PRODUCT_PRICE, 0.0) ?: 0.0
        val category = intent?.getStringExtra(PRODUCT_CATEGORY) ?: ""
        val image = intent?.getIntExtra(PRODUCT_IMAGE, -1) ?: -1

        val productItem =
            ProductItem(
                title,
                price,
                category,
                image
            )//todo replace with the passed values from intent
        setContent { ProductDetails(productItem) }
    }
}