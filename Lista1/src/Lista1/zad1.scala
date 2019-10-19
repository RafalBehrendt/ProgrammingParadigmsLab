def mulList (list:List[Int]):Int =
  if (list == Nil) throw new Exception("Pusta lista") else
  if (list.length == 1) list.head else
    list.head * mulList(list.tail)

mulList(List(2,3,4))