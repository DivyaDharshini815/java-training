class MathOperations 
{
public static int add(int a, int b) 
{
return a + b;
}
public static int subtract(int a, int b) 
{
return a - b;
}
public static int multiply(int a, int b) 
{
return a * b;
}
public static double divide(double a, double b) 
{
if (b != 0) 
{
return a / b;
} 
else 
{
throw new ArithmeticException("Cannot divide by zero");
}
}
public static double power(double base, double exponent) 
{
return Math.pow(base, exponent);
}
public static int absoluteValue(int a) 
{
return Math.abs(a);
}
public static void main(String[] args) 
{
System.out.println("Addition: " + add(5, 3));
System.out.println("Subtraction: " + subtract(5, 3));
System.out.println("Multiplication: " + multiply(5, 3));
System.out.println("Division: " + divide(5.0, 3.0));
}
}
