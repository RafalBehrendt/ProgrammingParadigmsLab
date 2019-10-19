let rec factorial num =
  if(num < 0) then failwith("Liczba jest ujemna") else
 if num > 1 then num*factorial(num-1)
 else 1;;
factorial 5;;