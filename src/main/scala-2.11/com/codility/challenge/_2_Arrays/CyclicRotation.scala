package com.codility.challenge._2_Arrays

/**
  * Created by obarros on 31/10/2016.
  */
object CyclicRotation {
  def solution(a: Array[Int], k: Int): Array[Int] = {
    // write your code in Scala 2.11
    val list: List[Int] = a.toList
    def loop(a: List[Int], k: Int): Array[Int] = {
      if (k == 0 || a.isEmpty) a.toArray
      else {
        loop(a.last :: a.take(a.length - 1), k - 1)
      }
    }
    loop(list, k)
  }
}





