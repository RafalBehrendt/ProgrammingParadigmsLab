  def podziel(lista: List[Int]): (List[Int], List[Int]) = {

    def deletePositive(innerList:List[Int]):List[Int] =
      innerList match {
        case Nil => Nil
        case hd::tl =>
          if (hd < 0) hd::deletePositive(tl) else
            deletePositive(tl)
      }

    def deleteEven(innerList:List[Int]):List[Int] =
      innerList match {
      case Nil => Nil
      case hd::tl =>
        if (hd % 2 == -1) hd::deleteEven(tl) else
          deleteEven(tl)
    }

    val allNegative = deletePositive(lista)
    val allEven = deleteEven(allNegative)

    (allNegative, allEven)

  }