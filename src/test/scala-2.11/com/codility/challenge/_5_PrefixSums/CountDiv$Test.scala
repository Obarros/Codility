package com.codility.challenge._5_PrefixSums

import org.scalatest.FunSuite

/**
  * Created by obarros on 01/11/2016.
  */
class CountDiv$Test extends FunSuite {

  test("testSolution") {
    assert(CountDiv.solution(6, 11, 2) == 3)
  }

  test("testSolution1 - 0") {
    assert(CountDiv.solution1(6, 11, 2) == 3)
  }
  test("testSolution1 - 1") {
    assert(CountDiv.solution1(6, 11, 3) == 2)
  }

  test("testSolution1 - 2") {
    assert(CountDiv.solution1(6, 100, 3) == 32)
  }
  test("testSolution2 - 1") {
    assert(CountDiv.solution2(6, 11, 3) == 2)
  }

  test("testSolution2 - 2") {
    assert(CountDiv.solution2(6, 100, 3) == 32)
  }

  test("test1") {
    assert(CountDiv.solution(6, 11, 2) == 3)
  }
  test("test2") {
    assert(CountDiv.solution(11, 345, 17) == 20)
  }
  test("test3") {
    assert(CountDiv.solution(0, 1, 5) == 1)
  }
  test("test4") {
    assert(CountDiv.solution(0, 1, 1) == 2)
  }
  test("test5") {
    assert(CountDiv.solution(10, 10, 20) == 0)
  }
  test("test6") {
    assert(CountDiv.solution(0, 1, 1) == 2)
  }
  test("test7") {
    assert(CountDiv.solution(0, 1, 2) == 1)
  }
  test("test8") {
    assert(CountDiv.solution(1, 2, 1) == 2)
  }
  test("test9") {
    assert(CountDiv.solution(1, 2, 2) == 1)
  }
  test("test10") {
    assert(CountDiv.solution(1, 2, 3) == 0)
  }
  test("test11") {
    assert(CountDiv.solution(1, 3, 1) == 3)
  }
  test("test12") {
    assert(CountDiv.solution(1, 3, 2) == 1)
  }
  test("test13") {
    assert(CountDiv.solution(1, 3, 3) == 1)
  }
  test("test14") {
    assert(CountDiv.solution(1, 3, 4) == 0)
  }
  test("test15") {
    assert(CountDiv.solution(0, 3, 4) == 1)
  }
  test("test16") {
    assert(CountDiv.solution(11, 345, 17) == 20)
  }
  test ("test17") {
    assert(CountDiv.solution(11, 14, 2) == 2)
  }

}
