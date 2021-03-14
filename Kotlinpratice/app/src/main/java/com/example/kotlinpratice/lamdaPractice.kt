package com.example.kotlinpratice

//1. lamda
// 람다식은 우리가 마치 value처럼 다룰 수 있는 익명함수이다.
// 1) 메소드의 파라미터로 넘겨줄 수가 있다.
// 2) return 값으로 사용할 수가 있다

// 람다의 기본 정의
// val lamdaName : Type = {argumentList -> codeBody}

val square : (Int) -> (Int) = {number -> number*number}

val nameAge = {name : String, age : Int -> "my name is ${name}, ${age}years old"}

fun main(){
    println(square(10))
    println(nameAge("jungwoo", 20))

    val a = "jungwoo said"
    val b = "bo said"


    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("ariana", 29))

    println(calculateGrade(98))

    val lamda = {number : Double ->
        number == 4.3213
    }

    println(invokeLamda(lamda))
    println(invokeLamda({it > 3.22}))

    println(invokeLamda { it > 3.22 })



}

// 확장함수
val pizzaIsGreat : String. () -> String = {
    this + "Pizza is the best!"

}

fun extendString(name : String, age : Int) : String{
    val introduceMyself : String.(Int) -> String = { "I am ${this} and ${it}years old" }
    return name.introduceMyself(age)
}

//람다의 Return

val calculateGrade : (Int) -> String = {
    when(it){
        in 0..40 -> "fail"
        in 41..80 -> "pass"
        in 81..100 -> "perfect"
        else -> "Error"
    }
}

//람다를 표현하는 여러가지 방법
fun invokeLamda(lamda : (Double) -> Boolean) : Boolean{
    return  lamda(5.2343)
}



