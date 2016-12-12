package com.codility.challenge._2_Arrays

import org.scalatest.FunSuite

/**
  * Created by obarros on 31/10/2016.
  */
class CyclicRotation$Test extends FunSuite {
  test("test CyclicRotation 0") {
    assert(CyclicRotation.solution(Array(3, 8, 9, 7, 6), 0).sum ==  Array(3, 8, 9, 7, 6).sum)
  }

  test("test CyclicRotation 1") {
    assert(CyclicRotation.solution(Array(3, 8, 9, 7, 6), 1).sum ==  Array(6, 3, 8, 9, 7).sum)
  }

 test("test 2") {
    assert(CyclicRotation.solution(Array(3, 8, 9, 7, 6), 2).sum == Array(7, 6, 3, 8, 9).sum)
  }

  test("test 3") {
    assert(CyclicRotation.solution(Array(3, 8, 9, 7, 6), 3).sum == Array(9, 7, 6, 3, 8).sum)
  }
  test("test 4") {
    assert(CyclicRotation.solution(Array(3, 8, 9, 7, 6), 4).sum == Array(8, 9, 7, 6, 3).sum)
  }

  test("test 5") {
    assert(CyclicRotation.solution(Array(3, 8, 9, 7, 6), 5).sum == Array(3, 8, 9, 7, 6).sum)
  }

  test("test 6") {
    assert(CyclicRotation.solution(Array(3, 8, 9, 7, 6), 6).sum == Array(6, 3, 8, 9, 7).sum)
  }
}

