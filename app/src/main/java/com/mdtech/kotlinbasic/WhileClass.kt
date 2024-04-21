package com.mdtech.kotlinbasic

fun main(){
    var count = 0
    while (count < 3){
        //so long it content will be executed
        println("Count is $count")
        count++ // or count + 1
    }
    println("Loop is done!")

    var userInput = readln()
    while (userInput == "1"){
        //so long it content will be executed
        println("while loop is executed")
        break
    }
    println("Loop is done!")

}