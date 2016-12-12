package com.codility.challenge._3_TimeComplexity

/**
  * Created by obarros on 31/10/2016.
  */
object FrogJmp {
  def solution(x: Int, y: Int, d: Int): Int = {
    // write your code in Scala 2.11
    math.ceil(( y - x) / d.toDouble).toInt
  }

}

