package com.codility.challenge._week_2_codility

import org.scalatest.FunSuite

/**
  * Created by obarros on 12/12/2016.
  */
class Solution$Test extends FunSuite {

//  test("testSolution 0") {
//    assert(Solution.solution(4, 17) == 3)
//  }
//
//  test ("testSolution 1") {
//    assert(Solution.solution(0, 17) == 5)
//  }
//
//  test ("testSolution 2") {
//    assert(Solution.solution(-10, -2) == 0)
//  }
//
//  test ("testSolution 3") {
//    assert(Solution.solution(1, 17) == 4)
//  }
//
//  test ("testSolution 4") {
//    assert(Solution.solution(-2, 17) == 5)
//  }
//
//  test ("testSolution 5") {
//    assert(Solution.solution(9, 17) == 2)
//  }
//
//  test ("testSolution 6") {
//    assert(Solution.solution(0, 0) == 1)
//  }
//
//  test ("testSolution 7") {
//    assert(Solution.solution(Int.MinValue, Int.MaxValue) == 46341)
//  }
//
//  test ("testSolution 8") {
//    assert(Solution.solution(Int.MinValue, 0) == 1)
//  }
//
//  test ("testSolution 9") {
//    assert(Solution.solution(0, Int.MaxValue) == 46341)
//  }


  // Test implementation 2


  test("testSolution 02") {
    assert(Solution.solution2(4, 17) == 3)
  }

  test ("testSolution 12") {
    assert(Solution.solution2(0, 17) == 5)
  }

  test ("testSolution 22") {
    assert(Solution.solution2(-10, -2) == 0)
  }

  test ("testSolution 32") {
    assert(Solution.solution2(1, 17) == 4)
  }

  test ("testSolution 42") {
    assert(Solution.solution2(-2, 17) == 5)
  }

  test ("testSolution 52") {
    assert(Solution.solution2(9, 17) == 2)
  }

  test ("testSolution 62") {
    assert(Solution.solution2(0, 0) == 1)
  }

  test ("testSolution 72") {
    assert(Solution.solution2(Int.MinValue, Int.MaxValue) == 46341)
  }

  test ("testSolution 82") {
    assert(Solution.solution2(Int.MinValue, 0) == 1)
  }

  test ("testSolution 92") {
    assert(Solution.solution2(0, Int.MaxValue) == 46341)
  }

  test ("testSolution 93") {
    assert(Solution.solution2(50, 150) == 5)
  }

  test ("testSolution 94") {
    assert(Solution.solution2(49, 63) == 1)
  }

  test ("testSolution 95") {
    assert(Solution.solution2(50, 64) == 1)
  }

  test ("testSolution 96") {
    assert(Solution.solution2(50, 63) == 0)
  }

  test("Testsolution 97"){
    assert(Solution.solution2(-2, 2) == 2)
  }

  test("Testsolution 98"){
    assert(Solution.solution2(-2, -1) == 0)
  }
  test("Testsolution 99"){
    assert(Solution.solution2(1, 1) == 1)
  }

}
