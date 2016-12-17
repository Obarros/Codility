package com.codility.challenge._codeforces_cyclic_shift

import org.scalatest.FunSuite

/**
  * Created by obarros on 17/12/2016.
  */
class Main$Test extends FunSuite {

  test("testSolution 1") {
     assert(Main.solution("abcd") == 4)
  }

  test("testSolution 2") {
     assert(Main.solution("bbb") == 1)
  }

  test("testSolution 3") {
     assert(Main.solution("aaa") == 1)
  }

  test("testSolution 4") {
     assert(Main.solution("yzyz") == 2)
  }

}
