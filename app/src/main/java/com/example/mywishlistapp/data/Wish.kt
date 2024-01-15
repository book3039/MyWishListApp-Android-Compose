package com.example.mywishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String
)

object DummyWish {
    val wishList = listOf(
        Wish(title = "Apple Watch Ultra", description = "But I don't have IPhone"),
        Wish(title = "MacBook Pro", description = "Wish of All developers"),
        Wish(title = "GV80", description = "Awesome Car"),
        Wish(title = "AK47", description = "R.I.P my grandma"),
    )
}