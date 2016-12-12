package com.codility.challenge._3_TimeComplexity

import org.scalatest.FunSuite

/**
  * Created by obarros on 31/10/2016.
  */
class FrogJmp$Test extends FunSuite {
  test("FrogJmp Test0") {
    assert(FrogJmp.solution(10, 85, 30) == 3)
  }
  test("FrogJmp Test1") {
    assert(FrogJmp.solution(10, 40, 30) == 1)
  }

  test("FrogJmp Test2") {
    assert(FrogJmp.solution(10, 70, 30) == 2)
  }

  test("FrogJmp Test3") {
    assert(FrogJmp.solution(10, 90, 30) == 3)
  }
}
