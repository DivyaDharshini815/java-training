import java.util.*;
class Fibonacciseries 
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the value of N to find the Nth Fibonacci number: ");
int n = scanner.nextInt();
System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
}
public static int fibonacci(int n) 
{
if (n <= 1)
return n;
else
return fibonacci(n - 1) + fibonacci(n - 2);
}
}
