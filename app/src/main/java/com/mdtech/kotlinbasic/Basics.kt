package com.mdtech.kotlinbasic

fun main(){

    //Creating an object/instance of the class Dog
    var daisy = Dog("Daisy", "Dwarf Poodle")
    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")

    //Comparison Operators
    //greater than>
    //lower than<
    //greater equal>=
    //lower equal<=
    //equal ==

    var age = 0
    println("Please enter your age as a whole number")
    //read what the user has entered into the console
    val enteredValue = readln()
    //convert thge string variable into an int variable
    age = enteredValue.toInt()
    //age = readln().toInt()
    if(age in 18..39){
        println("You can go into the club!")
    }else if(age >= 40){
        println("You are too old")
    }else{
        println("You are too young to go into the club!")
    }

}