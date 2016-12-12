package com.codility.challenge._5_PrefixSums

/**
  * Created by obarros on 01/11/2016.
  */
object PassingCars {
  def solution(a: Array[Int]): Int = {
    var countOne = 0
    var result = 0
    for(i <- a.length -1 to 0 by -1)
      {
        if(a(i) == 1)
          countOne += 1
        else
          result +=  countOne
      }
    if(math.abs(result) > 1000000000) -1
    else
      result
  }
}
