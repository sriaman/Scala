package com.ms.learning.oop.methodnotations

import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name: String, favouriteMovie: String, val age: Int=0) {
    def likes(movie: String): Boolean = movie == favouriteMovie
    def hangOutWith(person:Person):String =  s"${this.name}  is hanging out with ${person.name}"
    def +(person:Person):String =  s"${this.name}  is hanging out with ${person.name}"
    def +(nickName:String): Person= new Person(s"$name ($nickName)",favouriteMovie)
    def unary_! : String = s"$name, what the hack!"
    def unary_+ : Person = new Person(name, favouriteMovie,age+1)
    def isAlive :Boolean=true
    def apply():String=s"Hi! my name is $name and I like $favouriteMovie"
    def apply(n:Int):String=s"$name watched $favouriteMovie $n times"

    def learns(things:String)= s"$name is learning $things"
    def learnsScala = this learns "Scala"
  }


  val mary = new Person("Mary","Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") //equivalent to above statement
  //infix notation = operator notation (syntactic sugar) {only works for method with 1 parameter}

  // "operators" in scala
  val tom  =  new Person("Tom","FightClub")

  // all these below 3 statements are equivalent
  println(mary hangOutWith tom)
  println(mary + tom)
  println(mary.+(tom))

  println(1 + 2)
  println(1.+(2))

  // ALL OPERATORS ARE METHODS

  //prefix notations
  val x = -1 //equivalent with 1.unary_-x
  val y = 1.unary_-
  println(x==y)
  //unary_ prefix only works with +, -, ~, !

  println(!mary)
  println(mary.unary_!)

  //postfix
  println(mary.isAlive)
  println(mary isAlive)

  //apply
  println(mary.apply())
  println(mary()) //equivalent
  //println(mary apply)


  println((mary + "the Rockstar").apply())
  println((mary + "the Rockstar")())
  println(mary.+("the Rockstar").apply())

  println((+mary).age)
  println(mary learnsScala)

  println(mary.apply(2))
  println(mary apply 2)
  println(mary(2))
}
