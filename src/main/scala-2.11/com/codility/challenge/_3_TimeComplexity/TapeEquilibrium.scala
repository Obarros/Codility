package com.codility.challenge._3_TimeComplexity

/**
  * Created by obarros on 31/10/2016.
  */
object TapeEquilibrium {
  // 55 %
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.11

    val list = a.toList
    val RightSum = list.sum
    val LeftSum = 0

    def loop(list: List[Int], left: Int, right: Int, acc: Int, i: Int): Int = {
      if (list.length == i && acc != Int.MaxValue) acc
      else if (list.length == 1) list.sum
      else {
        loop(list, left + list(i), right - list(i), math.min(acc, math.abs(left - right)), i + 1)
      }
    }
    loop(list, LeftSum, RightSum, Int.MaxValue, 0)
  }

  //50% - 83%, 16 %

  def solution1(a: Array[Int]): Int = {
    // write your code in Scala 2.11
    val list = a.toList
    val j = 1

    def loop(list: List[Int], num: Int, result: Int): Int = {
      if(num == list.length -1) result
      else
        loop(list, num + 1, math.min(math.abs(list.take(num).sum - list.takeRight(list.length - num).sum), result))
    }

    loop(list, 1, Int.MaxValue)
  }

  // 100 %

  def solution2(a: Array[Int]): Int = {
    val list = a.toList
    var RightSum = list.sum
    var LeftSum = 0
    var result = Int.MaxValue
    for (i <- 0 until a.length - 1) {
      LeftSum = LeftSum + a(i)
      RightSum = RightSum - a(i)
      result = math.min(result, math.abs(LeftSum - RightSum))
      // println("Left " + LeftSum + " Rigth " + RightSum +" result "+ result)
    }
    result
  }

  println(solution2(Array(3, 1, 2, 4, 3)))
}


// using take and take rigth


