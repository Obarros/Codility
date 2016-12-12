package com.codility.challenge._4_CountingElements

import org.scalatest.FunSuite

/**
  * Created by obarros on 31/10/2016.
  */
class MissingInteger$Test extends FunSuite {

  test("testSolution 0") {
    assert(MissingInteger.solution(Array(1,3,6,4,1,2)) == 5)
  }
  test("testSolution 1") {
    assert(MissingInteger.solution(Array(1,3,6,4,1,5)) == 2)
  }
  test("testSolution 2") {
    assert(MissingInteger.solution(Array(5,3,6,4,7,2)) == 1)
  }
  test("testSolution 3") {
    assert(MissingInteger.solution(Array(1,3,5,4,1,2,7)) == 6)
  }
  test("testSolution 4") {
    assert(MissingInteger.solution(Array(1,3,6,4,1,2)) == 5)
  }
  test("testSolution 5") {
    assert(MissingInteger.solution(Array(1,3,6,4,1,2)) == 5)
  }
  test("testSolution 6 ") {
    assert(MissingInteger.solution(Array(1,1,6,4,1,2)) == 3)
  }
  test("testSolution 7 ") {
    assert(MissingInteger.solution(Array(1,3,6,3,1,2)) == 4)
  }
  test("testSolution 8 ") {
    assert(MissingInteger.solution(Array(1,3,6,8,5,4,1,2)) == 7)
  }
  test("testSolution 9 ") {
    assert(MissingInteger.solution(Array(1,3,6,4,5,6,8,4,1,2)) == 7)
  }
  test("testSolution 10 ") {
    assert(MissingInteger.solution(Array(21474, 2147483647)) == 1)
  }
  test("testSolution 11") {
    assert(MissingInteger.solution(Array()) == 1)
  }
  test("testSolution 12") {
    assert(MissingInteger.solution(Array(1)) == 2)
  }

  test("testSolution 13") {
    assert(MissingInteger.solution((0 to 100).toArray) == 2)
  }

//  test("testSolution 14") {
//    assert(MissingInteger.solution((0 to 100).toArray) == 101)
//  }

}
