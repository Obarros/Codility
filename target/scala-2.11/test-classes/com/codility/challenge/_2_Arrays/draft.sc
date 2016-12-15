def solution(a: Array[Int]): Int = {

  var countOne = 0
  var result = 0
  for(i <- a.length-1 to 0 by -1)
  {
  //  println(a(i) + " - " + countOne)
    if(a(i) == 1)
      countOne += 1
    else
      result +=  countOne
  }

  if(result > 1000000000) -1
  else
    result
}

solution(Array(0,1,0,1,1))



-1794967296 > 1000000000


val a = 11
val b = 345
val k = 17




(a to b).toList.count(x => x % k ==0)
(a to b).toList.filter( x => x % k ==0).length


def solution(a: Int, b: Int, k: Int): Int = {
  val result = (a to b).toList.count(x => x % k ==0)
  result
}

solution(a,b,k)
