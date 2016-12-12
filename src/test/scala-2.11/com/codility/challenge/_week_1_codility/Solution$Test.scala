package com.codility.challenge._week_1_codility

import org.scalatest.FunSuite

/**
  * Created by obarros on 13/11/2016.
  */
class Solution2$Test extends FunSuite {

  test("testSolution") {
    assert(Solution.solution(5) == List(1, 2, "Fizz", 4, "Buzz"))
  }
  test("testSolution 0") {
    assert(Solution.solution(1) == List(1))
  }

  test("testSolution 1") {
    assert(Solution.solution(6) == List(1, 2, "Fizz", 4, "Buzz", "Fizz"))
  }

  test("testSolution 2") {
    assert(Solution.solution(7) == List(1, 2, "Fizz", 4, "Buzz", "Fizz", "Woof"))
  }

  test("testSolution 3") {
    assert(Solution.solution(8) == List(1, 2, "Fizz", 4, "Buzz", "Fizz", "Woof", 8))
  }

  test("testSolution 4") {
    assert(Solution.solution(9) == List(1, 2, "Fizz", 4, "Buzz", "Fizz", "Woof", 8, "Fizz"))
  }

  test("testSolution 100") {
    assert(Solution.solution(100) == List(1, 2, "Fizz", 4, "Buzz", "Fizz", "Woof", 8, "Fizz", "Buzz", 11, "Fizz", 13, "Woof", "FizzBuzz", 16, 17, "Fizz", 19, "Buzz", "FizzWoof", 22, 23, "Fizz", "Buzz", 26, "Fizz", "Woof", 29, "FizzBuzz", 31, 32, "Fizz", 34, "BuzzWoof", "Fizz", 37, 38, "Fizz", "Buzz", 41, "FizzWoof", 43, 44, "FizzBuzz", 46, 47, "Fizz", "Woof", "Buzz", "Fizz", 52, 53, "Fizz", "Buzz", "Woof", "Fizz", 58, 59, "FizzBuzz", 61, 62, "FizzWoof", 64, "Buzz", "Fizz", 67, 68, "Fizz", "BuzzWoof", 71, "Fizz", 73, 74, "FizzBuzz", 76, "Woof", "Fizz", 79, "Buzz", "Fizz", 82, 83, "FizzWoof", "Buzz", 86, "Fizz", 88, 89, "FizzBuzz", "Woof", 92, "Fizz", 94, "Buzz", "Fizz", 97, "Woof", "Fizz", "Buzz")
    )
  }
  test("testSolution 24") {
    assert(Solution.solution(24) == List(1, 2, "Fizz", 4, "Buzz", "Fizz", "Woof", 8, "Fizz", "Buzz", 11, "Fizz", 13, "Woof", "FizzBuzz", 16, 17, "Fizz", 19, "Buzz", "FizzWoof", 22, 23, "Fizz"))
  }

  test("testSolution 1000") {
    assert(Solution.solution(1000).size == 1000)}

}

