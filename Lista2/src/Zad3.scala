def polacz [A](list1:List[A], list2:List[A]):List[A] =
  (list1, list2) match {
    case (Nil, Nil) => Nil
    case (Nil, hd::tl) => hd::polacz(Nil, tl)
    case (hd::tl, Nil) => hd::polacz(tl, Nil)
    case (hd1::tl1, hd2::tl2) => hd1::hd2::polacz(tl1, tl2)
}