package com.ms.learning.oop.inheritance

object InheritanceAndTraits extends App{

  sealed class Animal{
    val creatureType: String = "wild"
    def eat = println("eat eat")
//   final def eat = println("eat eat")
  }

  //overriding
  class Cat(override val creatureType: String) extends Animal{
    override def eat = println("cat cat")
  }

  val animal:Animal = new Cat("domestic")
  animal.eat
  println(animal.creatureType)


  //overriding and overloading


  //super

  // preventing overrides
  // 1- use final on member
  // 2- use final on class
  // 3- Use seal class using sealed keyword at class level

//  final class river{
//    val isFlow =true
//  }
//
//  class Ganga extends river{
//
//  }


}
