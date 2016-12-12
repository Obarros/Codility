package com.codility.challenge._3_TimeComplexity

/**
  * Created by obarros on 31/10/2016.
  */
object PermMissingElem {
  def solution1(a: Array[Int]): Int = {
    val noMissingElement: Array[Int] = (1 to a.length + 1).toArray

    val b = a.sorted :+ 0
    val result: Int = 0
    if (a.length == 0)
      return 1
    for (i <- 0 until noMissingElement.length - 1) {
      if (b(i) != noMissingElement(i))
        return noMissingElement(i)
    }
    result
  }

  def solution(a: Array[Int]): Int = {
    (1 to a.length + 1).sum - a.sum
  }
}

