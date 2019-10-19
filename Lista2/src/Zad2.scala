
def dlugosc[A](list:List[A]):Int =
if(list == Nil) 0 else
  1+dlugosc(list.tail)