package com.ms.learning

object DefaultArgs extends App {

  def trFact(n: Int, acc: Int =1): Int =
    if(n<=1) acc
    else trFact(n-1,n*acc)

  val fact10 = trFact(5)
  println(fact10)

  def savePictures(format: String="jpg", width:Int=500,height:Int=800) =
    println("saving picture of format: "+format+" Width: "+width+" Height: "+height)
//  savePictures(80,900)
  savePictures(width = 800,height = 900,format = "png")
}
