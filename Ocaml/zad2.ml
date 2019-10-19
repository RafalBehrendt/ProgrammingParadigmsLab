let strings = ["Ala";"ma";"kota"];;
let rec sentenceMaker (stringList, ending, separator) =
if List.length stringList = 1 then List.hd stringList^ending
else (List.hd stringList)^separator^(sentenceMaker (List.tl stringList, ending, separator));;
sentenceMaker (strings, ".", " ");;