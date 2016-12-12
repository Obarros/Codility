package com.codility.challenge._4_CountingElements

/**
  * Created by obarros on 31/10/2016.
  */
object PermCheck {
  //70%

  def solution(a: Array[Int]): Int = {
    if (a.sum != (1 to a.length).sum) 0
    else 1
  }

  def solution2(a: Array[Int]): Int = {
    val result = Array.fill(a.length + 1)(0)
    for (i <- a.indices) {
      if (a(i) > result.length - 1) return 0
      else
        result(a(i)) += 1
    }
    if (result.takeRight(result.length - 1).exists(x => x > 1 || x == 0)) 0
    else
      1
  }

}
