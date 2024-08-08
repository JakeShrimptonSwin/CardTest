package com.example.kotlintest

class Card(var rank: String = "", var suit: String = ""){
    //PROPERTIES
    var flip : Boolean = true

    //FUNCTIONS
    fun flip(){
        flip = !flip
    }

    fun printDetails(){
        if (flip){
            println("$rank $suit")
        }
        else{
            println("-----")
        }
    }
}

