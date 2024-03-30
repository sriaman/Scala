package com.ms.learning.oop

object OoBasics extends App{

  val person = new Person()
  println(person.x)
  println(person.age)
  person.greet("Aman")
  person.greet()
  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print
}

//constructor
class Person(name:String,val age:Int) { //name is class parameters but age is class field coz we are define it as a val
  val x=2

  println(1+3)


  def greet(name:String)= println(s"${this.name} says : Hi! $name")
  def greet():Unit= println(s"Hi this is $name") // here name is similar to this.name

  //multiple constructors
  def this(name:String)= this(name,0)
  def this() = this("John Doe")
}
// class parameters and class fields are two different things


class Counter(val value:Int=0){
  def inc = {
    println("Incrementing")
    new Counter(value+1)
  }
  def dec = {
    println("Decrementing")
    new Counter(value-1)
  }

  def inc(value: Int): Counter = {
    if(value<=0) this
    else inc.inc(value-1)
  }
  def dec(value: Int): Counter= {
    if(value<=0) this
    else dec.dec(value-1)
  }
  def print= println(value)
}