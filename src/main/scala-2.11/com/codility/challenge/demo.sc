def mapAllPermutation(ss: String, delim: Int) = {
  val begin = 0
  val end = ss.length
  var j = List(0,1,2,3,4,5)
  for (i <- delim until end+1 by 1) yield ss.substring(j.head, i)
    //j = j + 1
}

val s = "02002"


def mapAllPermutation2(ss: String, delim: Int) = {
  val begin = 0
  val end = ss.length
  val j = List(0,1,2,3,4,5)
  for (i <- delim until end+1 by 1) yield {
    if(delim == i) ss.substring(j.head, i)
    else ss.substring(j.tail.head, i)
  }
}


def getAllPermutation(ss: String, delim: Int): List[String] = {
  val begin = 0
  val end = ss.length
  var result = List[String]()
  var j = 0
  for (i <- delim until end+1 by 1) {
     result =  result :+ ss.substring(j, i)
     j = j + 1
  }
  result
}

def splitAndCount1(list : List[String]) = {
  val listMap = list.map( w => w.toCharArray.toList)
  listMap
}


def splitAndCount(list : List[String]) = {
  val listMap = list.map( w => (w ,1))
  listMap
}



val uniqueValues = s.toSet[Char]


mapAllPermutation(s, 1).toList
mapAllPermutation(s, 2).toList
mapAllPermutation(s, 3).toList
mapAllPermutation(s, 4).toList
mapAllPermutation(s, 5).toList


mapAllPermutation2(s, 1).toList
mapAllPermutation2(s, 2).toList
mapAllPermutation2(s, 3).toList
mapAllPermutation2(s, 4).toList
mapAllPermutation2(s, 5).toList

getAllPermutation(s, 1)
getAllPermutation(s, 2)
getAllPermutation(s, 3)
getAllPermutation(s, 5)


splitAndCount(getAllPermutation(s, 4))
<<<<<<< HEAD
splitAndCount1(getAllPermutation(s, 4))

def shifString(s: String): String = {
  s.substring(1, s.length) + s.charAt(0)
}

def mapListOfShiftStrinf(s: String): List[String] = {
  var result = List[String]()
  var value = s
  var resultI = s
  result =   s :: result
  for (i <- 0 until s.length) {
    result = shifString(resultI) :: result
    value = shifString(value)
    resultI =  value
    println(value)
  }
  result.distinct
}



mapListOfShiftStrinf("abcd")
=======
val test  = splitAndCount1(getAllPermutation(s, 4))
val test2= test.map( x => x.map( z => (z, 1)))
val test3 = test2.map( x => x.groupBy( x => x._1))
test3.map()
>>>>>>> e2010a6c9216dc002ce8c6ed36a34810b0210e05
