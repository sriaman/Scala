package com.ms.learning.oop.scalaobjects

object Objects {

  //Scala does not have class-level functionality ("Static")
  object Person{ // type + its only instance
    // "static/class" - level functionality
    val N_EYES = 2
    def canFly: Boolean =false

    def apply(mother: Person, father:Person): Person = new Person("Bobby")
  }

  class Person(val name:String){
    // instance level functionality
  }

  def main(args: Array[String]): Unit = {


    println(Person.N_EYES)
    println(Person.canFly)

    // Scala Objects = SINGLETON INSTANCE
    val mary = Person
    val john = Person
    println(mary == john)

    val person1 = new Person("Mary")
    val person2 = new Person("John")

    val bobbie = Person(person1, person2)
  }
}
