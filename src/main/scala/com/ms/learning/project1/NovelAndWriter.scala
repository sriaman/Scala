package com.ms.learning.project1

object NovelAndWriter extends App{

  val writer = new Writer("Aman","Srivastav",1997)
  println(writer.fullName)

  var novel= new Novel("ABC",2022,writer)
  println(novel.authorAge())
  println(novel.isWritenBy(writer))
  novel = novel.copy(2024)
  println(novel.authorAge())
}
