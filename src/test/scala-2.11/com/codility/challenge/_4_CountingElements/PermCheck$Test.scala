package com.codility.challenge._4_CountingElements

import org.scalatest.FunSuite

/**
  * Created by obarros on 31/10/2016.
  */
class PermCheck$Test extends FunSuite {

  test("testSolution 1") {
     assert(PermCheck.solution2(Array(4,1,3,2)) == 1)
  }
  test("testSolution 2") {
     assert(PermCheck.solution2(Array(4,1,3)) == 0)
  }


}
