package com.codility.challenge._vanadium2016

import org.scalatest.FunSuite

/**
  * Created by obarros on 13/12/2016.
  */
class Solution$Test extends FunSuite {

  test("testSolution 0") {
    assert(Solution.solution("02002") == 11)
  }

  test("testSolution 1") {
    assert(Solution.solution("0000") == 10)
  }

  test("testSolution 2") {
    assert(Solution.solution("000") == 6)
  }

  test("testSolution 3") {
    assert(Solution.solution("01234") == 4)
  }

  test("testSolution 4") {
    assert(Solution.solution("0112334") == 17)
  }

}
