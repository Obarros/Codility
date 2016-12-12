package com.codility.challenge._3_TimeComplexity

import org.scalatest.FunSuite

/**
  * Created by obarros on 31/10/2016.
  */
class TapeEquilibrium$Test extends FunSuite {
  test("TapeEquilibrium test 0") {
    assert(TapeEquilibrium.solution2(Array(3, 1, 2, 4, 3)) == 1)
  }
  test("TapeEquilibrium test 1") {
    assert(TapeEquilibrium.solution2(Array(3, 1, 2, 4, 2)) == 0)
  }

}


