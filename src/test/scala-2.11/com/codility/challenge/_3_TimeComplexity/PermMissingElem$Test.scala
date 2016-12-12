package com.codility.challenge._3_TimeComplexity

import org.scalatest.FunSuite

/**
  * Created by obarros on 31/10/2016.
  */
class PermMissingElem$Test extends FunSuite {
  test("testSolution PermMissingElement test 0") {
    assert(PermMissingElem.solution(Array(1, 2, 3, 5)) == 4)
  }
  test("testSolution PermMissingElement test 1") {
    assert(PermMissingElem.solution(Array(1, 4, 3, 5)) == 2)
  }

  test("testSolution PermMissingElement test 2") {
    assert(PermMissingElem.solution(Array(1, 2, 4, 5)) == 3)
  }

  test("testSolution PermMissingElement test 3") {
    assert(PermMissingElem.solution(Array(1, 2, 3, 5)) == 4)
  }

  test("testSolution PermMissingElement test 4") {
    assert(PermMissingElem.solution(Array(1)) == 2)
  }

  test("testSolution PermMissingElement test 5") {
    assert(PermMissingElem.solution(Array(2)) == 1)
  }

}
