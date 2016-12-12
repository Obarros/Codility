package com.codility.challenge._week_1_codility

/**
  * Created by obarros on 13/11/2016.
  *  Performance: N/A
  *  Correctness : 100 %
  *  Total : 100 %
  */
object Solution {
  def solution(n: Int) = {
    val result = (1 to n).map {
    x => (x, if (x % 3 == 0) "Fizz" else x)
  }.map {
    x => (x._1, if (x._1 % 5 == 0) {
      if (x._2 == x._1) "Buzz" else x._2 + "Buzz"
    } else x._2)
  }.map {
    x => (x._1, if (x._1 % 7 == 0) {
      if (x._2 == x._1) "Woof" else x._2 + "Woof"
    } else x._2)
  }
  result.map(x => x._2)
  //result.foreach(println)
  //    result.map(x => x._2).foreach(println)

    //https://codility.com/c/feedback/A6865D-QH9
  }
}
