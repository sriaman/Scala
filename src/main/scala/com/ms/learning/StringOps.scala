package com.ms.learning

object StringOps extends App {

  val str: String = "Hello! there I am learning Scala"
  println(str.charAt(2))
  println(str.strip())
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("hello"))
  println(str.contains("A"))
  println(str.replace(" ","-"))

  val aNumberString ="2"
  val aNumber = aNumberString.toInt
  println(aNumber)
  println('a' +: aNumberString :+ 'z') // prepending and appending
  println(str.reverse)
  println(str.take(5))


  //Scala specific : String Interpolation

  //S-interpolators

  val name = "Aman"
  val age = 27
  val greeting = s"Hey! my name is $name and I'm $age years old"
  print(greeting)
}
