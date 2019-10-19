let intList = [1;-2;3;4];;
let rec isPositive list = 
if list = [] then true
else if List.hd list < 0 then false
else isPositive(List.tl list);;

isPositive(intList)