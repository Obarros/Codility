package com.codility.challenge._week_2_codility

/**
  * Created by obarros on 12/12/2016.
  */
object Solution {
  def solution(a: Int, b: Int) : Int = {
    if ( a >= 0)
      ((math.sqrt(b) - math.sqrt(a)) + 1).toInt
    else
      (math.sqrt(b)  + 1).toInt
  }
}


