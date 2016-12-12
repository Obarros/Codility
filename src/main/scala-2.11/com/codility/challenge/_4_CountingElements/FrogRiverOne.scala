package com.codility.challenge._4_CountingElements

/**
  * Created by obarros on 31/10/2016.
  */
object FrogRiverOne {
  //  72%

  def solution(x: Int, a: Array[Int]): Int = {

    val result = Array.fill(x + 1)(0)

    for (i <- a.indices) {
      // update the element with the value we need
      if (a(i) <= result.length - 1) result(a(i)) += 1
      //check if we have leaf at all the places
      if (!result.takeRight(result.length - 1).contains(0)) return i
    }
    -1
  }


  // 72% - better performance, introduce errors 83% + 60%
  def solution1(x: Int, a: Array[Int]): Int = {

    val result = Array.fill(x + 1)(0)

    for (i <- a.indices) {
      // update the element with the value we need
      if (a(i) <= result.length - 1) result(a(i)) += 1
      //check if we have leaf at all the places
      if (i >= x) {
        if (!result.takeRight(result.length - 1).contains(0))
          return i
      }
    }
    -1
  }

  // 100 %
  def solution2(x: Int, a: Array[Int]): Int = {

    val result = Array.fill(x + 1)(0)
    var countTotal = 0
    for (i <- a.indices) {
      // update the element with the value we need
      if (a(i) <= result.length - 1) {
        if (result(a(i)) == 0)
          countTotal += 1
        result(a(i)) += 1
      }
      //check if we have leaf at all the places
      if (countTotal == x) {
        //  if (!result.takeRight(result.length - 1).contains(0))
        return i
      }
    }
    -1
  }


}
