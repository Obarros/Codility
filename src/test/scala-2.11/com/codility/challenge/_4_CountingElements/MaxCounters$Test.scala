package com.codility.challenge._4_CountingElements

import org.scalatest.FunSuite

/**
  * Created by obarros on 01/11/2016.
  */
class MaxCounters$Test extends FunSuite {

  test("testSolution 0") {
    assert(MaxCounters.solution(5, Array(3, 4, 4, 6, 1, 4, 4)).sum == Array(3, 2, 2, 4, 2).sum)
  }

  test("testSolution 1") {
    assert(MaxCounters.solution(5, Array(3, 4, 4)).sum == Array(0, 0, 1, 2, 0, 0).sum)
  }

  test("testSolution1 0") {
    assert(MaxCounters.solution1(5, Array(3, 4, 4, 6, 1, 4, 4)).sum == Array(3, 2, 2, 4, 2).sum)
  }

  test("testSolution1 1") {
    assert(MaxCounters.solution1(5, Array(3, 4, 4)).sum == Array(0, 0, 1, 2, 0, 0).sum)
  }

  test("testSolution3 0") {
    assert(MaxCounters.solution3(5, Array(3, 4, 4, 6, 1, 4, 4)).sum == Array(3, 2, 2, 4, 2).sum)
  }

  test("testSolution3 1") {
    assert(MaxCounters.solution3(5, Array(3, 4, 4)).sum == Array(0, 0, 1, 2, 0, 0).sum)
  }

  test("testSolution4 0") {
    assert(MaxCounters.solution4(5, Array(3, 4, 4, 6, 1, 4, 4)).sum == Array(3, 2, 2, 4, 2).sum)
  }

  test("testSolution4 1") {
    assert(MaxCounters.solution4(5, Array(3, 4, 4)).sum == Array(0, 0, 1, 2, 0, 0).sum)
  }

}
