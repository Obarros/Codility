package com.codility.challenge._4_CountingElements

/**
  * Created by obarros on 31/10/2016.
  */
object MissingInteger {
  def solution(a: Array[Int]): Int = {

    // 77% - 80% +
    // 100 %
    val aDistinctSorted = a.distinct.filter(x => x > 0).sorted

    val totalDistinct = aDistinctSorted.length

    val allRange = (1 to a.length + 1).toArray

    val finalList = aDistinctSorted :+ Array(allRange.length - totalDistinct)(0)

    for(i <- allRange.indices)
      {
        if(allRange(i) != finalList(i))
          return allRange(i)
      }
    allRange(0)
  }
}
