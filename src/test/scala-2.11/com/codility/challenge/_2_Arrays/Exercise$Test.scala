package com.codility.challenge._2_Arrays

import org.scalatest.FunSuite

/**
  * Created by obarros on 28/10/2016.
  */
class Exercise$Test extends FunSuite {
  test("Test  Odd 1") {
    assert(OddOccurrencesInArray.solution(Array(9, 3, 9, 3, 9, 7, 9)) == 7)
  }
  test("Test 2 odd 2") {
    assert(OddOccurrencesInArray.solution(Array(9, 7, 7, 3, 9, 9, 9)) == 3)
  }
  test("Test Odd 3") {
    assert(OddOccurrencesInArray.solution(Array(9, 3, 9, 3, 8, 7, 7)) == 8)
  }

}
