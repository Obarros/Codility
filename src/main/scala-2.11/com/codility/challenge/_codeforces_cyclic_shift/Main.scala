package com.codility.challenge._codeforces_cyclic_shift

/**
  * Created by obarros on 17/12/2016.
  */
object Main {
  def main(args: Array[String]): Unit = {
    val word = scala.io.StdIn.readLine()
    print(solution(word))
  }

  def solution(s: String): Int = {
    mapListOfShiftString(s).length
  }

  def shifString(s: String): String = {
    s.substring(1, s.length) + s.charAt(0)
  }

  def mapListOfShiftString(s: String): List[String] = {
    var result = List[String]()
    var value = s
    var resultI = s
    result =   s :: result
    for (i <- 0 until s.length) {
      result = shifString(resultI) :: result
      value = shifString(value)
      resultI =  value
  //    println(value)
    }
    result.distinct
  }

}
