package com.codility.challenge._week_2_codility

import org.scalatest.FunSuite

/**
  * Created by obarros on 12/12/2016.
  */
class Solution$Test extends FunSuite {

  test("testSolution 0") {
    assert(Solution.solution(4, 17) == 3)
  }

  test ("testSolution 1") {
    assert(Solution.solution(0, 17) == 5)
  }

  test ("testSolution 2") {
    assert(Solution.solution(-10, -2) == 0)
  }

  test ("testSolution 3") {
    assert(Solution.solution(1, 17) == 5)
  }

  test ("testSolution 4") {
    assert(Solution.solution(-2, 17) == 5)
  }

  test ("testSolution 5") {
    assert(Solution.solution(9, 17) == 2)
  }


}
