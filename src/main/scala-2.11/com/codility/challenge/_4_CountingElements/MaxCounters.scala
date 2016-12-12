package com.codility.challenge._4_CountingElements

/**
  * Created by obarros on 01/11/2016.
  */
object MaxCounters {
  //77%
  def solution(n: Int, a: Array[Int]): Array[Int] = {

    def increase(a: Array[Int], x: Int): Array[Int] = {
      a(x - 1) = a(x - 1) + 1
      a
    }

    def maxCounters(a: Array[Int], max: Int): Array[Int] = {
      a.map(x => max)
    }

    // create a zero based array
    var result = Array.fill(n)(0)
    result.mkString(",")
    for (i <- a.indices) {
      if (1 <= a(i) && a(i) <= n)
        increase(result, a(i))
      else if (a(i) == n + 1)
        result = maxCounters(result, result.max)
    }
    result
  }

  def solution1(n: Int, a: Array[Int]): Array[Int] = {

    def increase(a: Array[Int], x: Int): Array[Int] = {
      a(x - 1) = a(x - 1) + 1
      a
    }

    def maxCounters(a: Array[Int], max: Int): Array[Int] = {
      a.map(x => max)
    }

    // create a zero based array
    var result = Array.fill(n)(0)
    for (i <- a.indices) {
      if (1 <= a(i) && a(i) <= n)
        increase(result, a(i))
      else if (a(i) == n + 1)
        result = maxCounters(result, result.max)
    }
    result
  }

//88% - 100% + 80%

  def solution3(n: Int, a: Array[Int]): Array[Int] = {

    def increase(a: Array[Int], x: Int): Array[Int] = {
      a(x - 1) = a(x - 1) + 1
      a
    }
    def maxCounters(a: Array[Int], max: Int): Array[Int] = {
      a.map(x => max)
    }
    // create a zero based array
    var result = Array.fill(n)(0)
    for (i <- a.indices) {
      if (1 <= a(i) && a(i) <= n)
        increase(result, a(i))
      else if (a(i) == n + 1) {
        if (i > 1 && a(i - 1) == n + 1)
          result
        else
          result = maxCounters(result, result.max)
      }
    }
    result
  }

  def solution4(n: Int, a: Array[Int]): Array[Int] = {

    def increase(a: Array[Int], x: Int): Array[Int] = {
      a(x - 1) = a(x - 1) + 1
      a
    }
    def maxCounters(a: Array[Int], max: Int): Array[Int] = {
      a.map(x => max)
    }
    // create a zero based array
    var result = Array.fill(n)(0)
    for (i <- a.indices) {
      if (1 <= a(i) && a(i) <= n)
        increase(result, a(i))
      else if (a(i) == n + 1 && i > 1 && a(i-1) == n+1)
      //{
//        if (i > 1 && a(i - 1) == n + 1)
          result
        else
          result = maxCounters(result, result.max)
    //  }
    }
    result
  }

}
