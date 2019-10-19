let list = [3;3;2];;
let rec mulList list =
  if list = [] then failwith "Pusta lista"
  else if List.length list = 1 then List.hd list
  else List.hd list * mulList(List.tl list);;

mulList list;;