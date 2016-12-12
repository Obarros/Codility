package com.codility.challenge._week_0_codility

/**
  * Created by obarros on 02/11/2016.
  *  Performance: N/A
  *  Correctness : 100 %
  *  Total : 100 %
  */
object NumberOfTimesOccursOne {
  def solution(n: Int): Int = {
    (1 to n).mkString count (_ == '1')
  }
}
