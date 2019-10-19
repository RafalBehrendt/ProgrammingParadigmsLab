def factorial (number:Int):Int =
  if (number < 0) throw new Exception("Liczba jest ujemna") else
  if (number > 1) number*factorial(number-1) else 1

factorial (5)