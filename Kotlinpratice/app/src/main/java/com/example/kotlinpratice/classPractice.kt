package com.example.kotlinpratice

open class Human constructor(val name : String = "Anonymous"){

    constructor(name: String, age : Int) : this(name){
        println("my name is ${name}, ${age}years old")
    }

    init {
        println("New human has been born!")
    }

    fun eatingCake(){
        println("This is so YUMYYYYYYY")

    }

    open fun singASong(){
        println("lalala")
    }

}

class Korean : Human(){
    override fun singASong(){
        super.singASong()
        println("lalalalalaa")
        println("My name is ${name}")
    }
}


fun main(){
    val human = Human("minsu")
    val stranger = Human()
    val mom = Human("Kuri", 50)

    human.eatingCake()
    println("This human's name is ${human.name},${stranger.name}")
    val korean = Korean()
    korean.singASong()

}

//java
/* class Person{
        public Person(String name){
            }
        public Person(String name, int age){
            this(name);

        }


    }
 */
