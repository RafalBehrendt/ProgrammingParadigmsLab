val strings = List()

def sentenceMaker (stringList:List[String], ending:Char, separator:Char):String =
    if (stringList == Nil) "" else
    if (stringList.length == 1) stringList.head+ending else
    stringList.head + separator + sentenceMaker(stringList.tail, ending, separator)

sentenceMaker (strings, '!', ' ')
