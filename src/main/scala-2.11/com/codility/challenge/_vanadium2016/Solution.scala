package com.codility.challenge._vanadium2016

/**
  * Created by obarros on 13/12/2016.
  */
object Solution {
  def solution(s: String): Int = {

    def getAllPermutation(ss: String, delim: Int): List[String] = {
      val begin = 0
      val end = ss.length
      var result = List[String]()
      var j = 0
      for (i <- delim until end + 1 by 1) {
        result = result :+ ss.substring(j, i)
        j = j + 1
      }
      result
    }

    val uniqueValues = s.toSet[Char]

    def splitAndCount(list : List[String]) = {
      val listMap = list.map( w => w.toCharArray.toList)
      listMap
    }

     0
  }

}
