package com.alexandrohlopes.listsstudy

fun main() {

    println("Immutable Lists - you cannot add new items to them")
    val months = listOf("January", "February", "March") // Declares a List of String
    println(months) // Prints the whole content of the List at once
    println("Size of the Months List: ${months.size}")
    val anyTypeList = listOf("Xurepa", 1, 1.3, true, null) // Lists accept any type of data - including a mix of them and also null
    println(anyTypeList)
    println("Size of the Any Type List: ${anyTypeList.size}")
    println("This is the null item -> ${anyTypeList[4]}") // This is a way of accessing an item at a specific position
    println("Prints each member of the List months in a line")
    for (month in months) { // This is a loop that allows us to do operations in each element of the List
        println(month) // In this case we are simply printing each element of the List in a line
    }

    println("\nMutable Lists - you can add new items to them")
    val additionalMonths = months.toMutableList()  // Takes the content of a Immutable Lists and add it to a new Mutable List
    val newMonths = arrayOf("April", "May", "June")
    additionalMonths.addAll(newMonths)
    additionalMonths.add("July") // Adds a single item to a Mutable List
    val monthz = arrayOf("September", "October", "November", "December")
    additionalMonths.addAll(monthz) // Adds a group of items (the Array) to a List
    println(additionalMonths)
    val week = mutableListOf<String>("Monday", "Tuesday", "Wednesday")
    week.add("Thursday")
    week[2] = "Sunday" // This line will overwrite the 3rd member (Wednesday)
    println(week)
    week.removeAt(2) // Removes a specific item at a certain position
    println(week)
    week[2] = "Wednesday"
    val weekz = arrayOf("Thursday", "Friday", "Saturday", "Sunday")
    week.addAll(weekz)
    println(week)
    val weekend = mutableListOf<String>("Saturday", "Sunday")
    week.removeAll(weekend) // Removes items written on list
    // week.removeAll(week) -> Removes all items from a list
    println(week)
}