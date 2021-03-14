package com.example.kotlinpratice

data class Ticket(val companyName : String , val nam : String , var date : String, var seatnumber : Int)
// toString(), hashCode(), equals(), copy()

class Ticketnomal(val companyName : String , val nam : String , var date : String, var seatnumber : Int)
fun main(){
    val ticketA = Ticket("KoreanAir", "jungwoo", "2002-11-26", 30)
    val ticketB = Ticketnomal("KoreanAir", "jungwoo", "2002-11-26", 30)
    println(ticketA)
    println(ticketB)


}

