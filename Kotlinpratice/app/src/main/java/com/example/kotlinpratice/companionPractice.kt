package com.example.kotlinpratice

class Book private constructor(val id : Int, val name : String){
    companion object BookFactory : Idprovider{
        override fun getId(): Int {
            return 444
        }

        val myBook = "new Book"

        fun create() = Book(getId(), myBook)

    }


}

interface Idprovider {
    fun getId() : Int
}

fun main(){
    val book1 = Book.create()

    val bookId = Book.BookFactory.getId()


    println("${book1.id}, ${book1.name}")

}