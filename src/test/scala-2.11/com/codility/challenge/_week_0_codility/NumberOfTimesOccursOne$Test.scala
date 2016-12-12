package com.codility.challenge._week_0_codility

import org.scalatest.FunSuite

/**
  * Created by obarros on 02/11/2016.
  */
class NumberOfTimesOccursOne$Test extends FunSuite {

  test("testSolution 0") {
    assert(NumberOfTimesOccursOne.solution(13) == 6)
  }
  test("testSolution 1") {
    assert(NumberOfTimesOccursOne.solution(0) == 0)
  }
  test ("testSolution 2") {
    assert(NumberOfTimesOccursOne.solution(9) == 1)
  }
  test ("testSolution 3") {
    assert(NumberOfTimesOccursOne.solution(10) == 2)
  }
  test ("testSolution 4") {
    assert(NumberOfTimesOccursOne.solution(11) == 4)
  }
  test ("testSolution 5") {
    assert(NumberOfTimesOccursOne.solution(12) == 5)
  }

}
