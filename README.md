# Problem 1 
This code finds minimum number in an array by iterating through each element in the array and checking if it's smaller than the current minimum. If it is, the minimum value is updated. Finally, the minimum value is returned. The program prompts the user to input the number of elements and the elements themselves using Scanner.
# Problem 2 
This program asks the user to input the number of elements in an array and the elements themselves. It then calculates and prints the average of the elements using a separate method called "calculateAverage".
# Problem 3
This code takes an input number from the user and checks if it is a prime number or not. It uses a separate class called "PrimeChecker" that contains a method to check if a number is prime.
# Problem 4
This Java program calculates the factorial of a number using recursion. It reads the number inputted by the user, calls a recursive "factorial" function, and prints the result to the console. The "factorial" function returns 1 if the input is 0 (base case), otherwise it computes the factorial recursively using n! = n * (n-1)!.
# Problem 5
This Java program uses recursion to compute the n-th Fibonacci number. It reads the user's input, calls a recursive "fibonacci" function, and prints the result. The "fibonacci" function returns 0 if the input is 0, 1 if the input is 1 (base cases), and recursively computes the n-th Fibonacci number using the formula Fn = Fn-1 + Fn-2 for n > 1.
# Problem 6
This Java program calculates the power of a number using recursion. It reads the base and exponent inputted by the user, calls a recursive "power" function, and prints the result. The "power" function returns 1 if the exponent is 0 (base case), and recursively computes the power using the formula a^n = a * a^(n-1) for n > 0.
# Problem 7
This is a Java program that prompts the user to input an integer array, and then reverses the order of the elements in the array using a recursive function.
# Problem 8
This Java program checks if a given string consists of only digits. It takes a user input string, passes it to a method called checkAllDigits, which returns true if all characters in the string are digits, and false otherwise. The main method then prints "Yes" if the checkAllDigits method returns true, and "No" otherwise. The program uses recursion to check each character in the string.
# Problem 9
The code prompts the user to input two integers n and k, and then calls the recursive method calculateBinomialCoefficient to compute the binomial coefficient C(n,k) using the formula C(n,k) = C(n-1,k-1) + C(n-1,k). The method returns 1 for base cases where k equals 0 or n, and recursively calls itself for the other cases until a base case is reached.

Overall, this code calculates the binomial coefficient C(n,k) using recursion.
# Problem 10
This code finds the greatest common divisor (GCD) of two numbers using the Euclidean algorithm recursively. The user is prompted to enter two integers and the findGCD function is called with those values as arguments. The function returns the GCD of the two numbers by recursively calling itself with the second argument being the remainder of the first argument divided by the second argument, until the second argument is 0 (the base case). The final result is printed to the console.
