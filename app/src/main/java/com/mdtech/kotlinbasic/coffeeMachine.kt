package com.mdtech.kotlinbasic



fun main() {
    val coffeeForDenis = CoffeeDetails(0, "denis", "XXL", 1)
    makeCoffee(coffeeForDenis)
}

data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size: String,
    val creamAmount: Int,
)

fun askCoffeeDetails() {
    println("who is this coffee for?")
    val name = readln()
    println("How many pieces of sugar do you want?")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()
}

//Define Function
fun makeCoffee(coffeeDetails: CoffeeDetails) {

    if (coffeeDetails.sugarCount == 1 || coffeeDetails.sugarCount == 0) {
        println("Coffee with ${coffeeDetails.sugarCount}"+
                "spoon of sugar for ${coffeeDetails.name}"+
                "and cream: ${coffeeDetails.creamAmount}")
            } else {
        println("Coffee with ${coffeeDetails.sugarCount}"+
                "spoons of sugar for ${coffeeDetails.name}"+
                "and cream: ${coffeeDetails.creamAmount}")
    }
}