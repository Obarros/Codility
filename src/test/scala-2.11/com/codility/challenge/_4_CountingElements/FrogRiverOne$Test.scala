package com.codility.challenge._4_CountingElements

import org.scalatest.FunSuite

/**
  * Created by obarros on 31/10/2016.
  */
class FrogRiverOne$Test extends FunSuite {

  test("testSolution 0") {
    assert(FrogRiverOne.solution(5, Array(1,3,1,4,2,3,5,4)) == 6)
  }

  test("testSolution 1") {
    assert(FrogRiverOne.solution(4, Array(1,3,1,4,2,3,5,4)) == 4)
  }

  test("testSolution 2") {
    assert(FrogRiverOne.solution(3, Array(1,3,1,4,2,3,5,4)) == 4)
  }

  test("testSolution1 0") {
    assert(FrogRiverOne.solution1(5, Array(1,3,1,4,2,3,5,4)) == 6)
  }

  test("testSolution1 1") {
    assert(FrogRiverOne.solution1(4, Array(1,3,1,4,2,3,5,4)) == 4)
  }

  test("testSolution1 2") {
    assert(FrogRiverOne.solution2(3, Array(1,3,1,4,2,3,5,4)) == 4)
  }

  test("testSolution2 0") {
    assert(FrogRiverOne.solution2(5, Array(1,3,1,4,2,3,5,4)) == 6)
  }

  test("testSolution2 1") {
    assert(FrogRiverOne.solution2(4, Array(1,3,1,4,2,3,5,4)) == 4)
  }

  test("testSolution2 2") {
    assert(FrogRiverOne.solution2(3, Array(1,3,1,4,2,3,5,4)) == 4)
  }

}
