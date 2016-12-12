package com.codility.challenge._2_Arrays

/**
  * Created by obarros on 28/10/2016.
  */
object OddOccurrencesInArray {
  def solution(a: Array[Int]): Int = {
    // sorte the array and find the element unpaired
    if(a.length == 1) return a(0)

    val aSorted = a.sorted

    def loop(array: Array[Int], index: Int): Int = {
      if (index  > aSorted.length -1) array.last
      else if (array(index - 1) != array(index)) array(index - 1)
      else
        loop(array,  index + 2)
    }
    loop(aSorted, 1)
  }
}



