package com.codility.challenge._week_2_codility

/**
  * Created by obarros on 12/12/2016.
  *   Performance: 100 %
  *  Correctness : 100 %
  *  Total : 100 %
  */

object Solution {

  def solution2(a: Int, b: Int): Int =
    a match {
      case x if x >= 1 => math.sqrt(b).toInt - math.sqrt(a - 1).toInt
      case _ => (math.sqrt(b) + 1).toInt
    }
}


