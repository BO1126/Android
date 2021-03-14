package com.example.kotlinpratice

// function main

fun main(){
    ignoreNulls("tekken7")


}

//조건문 if / when
fun maxBy(a : Int, b: Int) : Int {
    if (a>b){
        return a
    }
    else{
        return b
    }

}

fun maxBy2(a: Int, b: Int) :Int = if(a>b) a else b

fun checkNum(score : Int){
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2,3")
        else -> println("I don't know")
    }

    var b = when(score){
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b : ${b}")

    when(score){
        in 90..100 -> println("You are A")
        in 10..80 -> println("nooooo")
        else -> println("okay")
    }
}

//Hello world

fun helloWorld(){
    println("Hello World")
}


fun  add(a : Int, b : Int) : Int {
    return a+b

}

//val = value 변하지 않는 값 / var = 변할 수 있는 값

fun hi(){
    val a : Int = 10
    var b : Int = 9

    b = 100

    val c = 100
    var d = 100

    var name : String = "jungwoo"


}

//array / List / arrayList

fun array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1,"b",3.4f)
    val list2 = listOf(1, "d",11L)

    array[0] = 3
    list

    var arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)




}

// 반복문 for / while
fun forAndWhile(){
    val student = arrayListOf("Jungwoo","Alex","jenny","James")
    for (name : String in student){
        println("$name")
    }

    var sum =0

    for(i in 1 until 100){
        sum +=i
    }
    println(sum)

    for((index, name) in student.withIndex()){
        println("${index}번째 학생 : $name")
    }

    var index = 1
    while(index<10){
        println("current index : ${index}")
        index++
    }

}

// Nullable / NorNull

fun nullcheck(){
    var name : String = "jungwoo"
    var nullname : String? = null

    var nameInUpperCase = name.toUpperCase()
    var nullnameInUpperCase = nullname?.toUpperCase()

    //?:
    val  lastName : String? = "lee"
    val fullName = name + (lastName?: " No lastName")
    println(fullName)

}

// !!

fun ignoreNulls(str:String?){
    val mNotNull : String = str!!
    val upper = mNotNull.toUpperCase()
    println(upper)

    val email : String? = "jungwoo0000@naver.com"
    email?.let {   //email이 null이 아니면 동작을 해라
        println("my email is ${email}")

    }
}

// class


