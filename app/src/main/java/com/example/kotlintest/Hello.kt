package com.example.kotlintest

fun createCard(){
    val myCard = Card("ACE", "HEARTS")
    myCard.printDetails()
    myCard.flip()
    myCard.printDetails()
}

fun main(){
    createCard()
}