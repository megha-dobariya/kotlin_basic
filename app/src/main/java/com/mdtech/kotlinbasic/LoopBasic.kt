package com.mdtech.kotlinbasic

fun main() {

    //Immutable list - you can not add item after initialization
    //val shoppingList = listOf("Processor", "RAM", "Graphic card", "SSD")
    //Mutable list - you can not add items later and modify
    val shoppingList = mutableListOf("Processor", "RAM", "Graphic card RTX 3060", "SSD")
    println("main shopping list $shoppingList")

    //adding  item to a list
    shoppingList.add("Cooling System")
    println("After adding Cooling System list $shoppingList")

    shoppingList.remove("Graphic card RTX 3060")
    println("After Graphic card RTX 3060 removing list $shoppingList")

    shoppingList.add("Graphic card RTX 4090")
    println("after Graphic card RTX 4090 adding shopping list $shoppingList")

    shoppingList.removeAt(1)
    println("After remove index 1 shopping list $shoppingList")

    shoppingList.add(2,"RAM 3GB")
    println("after add at second position shopping list $shoppingList")

    shoppingList[3] = "Graphics Card RX 7800XT"
    println("after add on 3rd position shopping list $shoppingList")

    shoppingList.set(1, "Water Cooling")
    println("after add water cooling on 1st position shopping list $shoppingList")

    val hasRam = shoppingList.contains("RAM")
    //Check availability in to the list
    if(hasRam){
        println("Has RAM in the list")
    }else{
        println("No RAM in the list")
    }

    println("Total size of shooping list is == $shoppingList.size")
    for(index in 0  until  shoppingList.size){
        println("item ${shoppingList[index]} is at index $index")

    }


    for(item in shoppingList){
        println(item)
        //Condition for loop till last item "RAM"
        if(item== "RAM"){
            //Remove last item
            shoppingList.removeLast()
            break
        }
    }
}