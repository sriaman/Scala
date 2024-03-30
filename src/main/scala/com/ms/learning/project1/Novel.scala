package com.ms.learning.project1

class Novel(name:String, yearOfRelease:Int,val author:Writer) {


  def authorAge()={
    yearOfRelease-author.yearOfBirth
  }

  def isWritenBy(author: Writer)={
    author == this.author
  }

  def copy(latestRelease:Int): Novel = {
    new Novel("ABC",latestRelease,author)
  }
}
