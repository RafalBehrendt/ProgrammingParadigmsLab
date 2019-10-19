val intList = List(1,-2,3,4)

def isPositive (list:List[Int]):Boolean =
  if (list == Nil) true else
    if (list.head < 0) false else
    isPositive(list.tail)
