package com.codility.challenge._5_PrefixSums

/**
  * Created by obarros on 01/11/2016.
  */
object CountDiv {
  def solution(a: Int, b: Int, k: Int): Int = {
    (a to b).toList.count(x => x % k == 0)
  }

  def solution1(a: Int, b: Int, k: Int): Int = {
    (a to b).toList.count(x => x % k == 0)
  }

  def solution2(a: Int, b: Int, k: Int): Int = {
    val result = (b / k) - (a / k)
    if (a % k == 0)
      result + 1
    else
      result
  }
}
