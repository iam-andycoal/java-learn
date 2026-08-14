public class Operators 
{
  public static void main(String[] args)
  {
    // Arithmetic Operators
    int a = 10;
    int b = 5;
    int c = a + b; // Addition
    int d = a - b; // Subtraction
    int e = a * b; // Multiplication
    int f = a / b; // Division
    int g = a % b; // Modulus

    System.out.println("Addition of 10 and 5: " + c);
    System.out.println("Subtraction of 10 and 5: " + d);
    System.out.println("Multiplication of 10 and 5: " + e);
    System.out.println("Division of 10 and 5: " + f);
    System.out.println("Modulus of 10 and 5: " + g);

    int z = 5;
    ++z; // Increment
    --z; // Decrement
    System.out.println("Incremented value of z: " + z);
    System.out.println("Decremented value of z: " + z);

    //Comparison Operators
    int h = 10;
    int i = 3;
    System.out.println(h > i); // greater than
    System.out.println(h < i); // less than
    System.out.println(h == i); // equal to
    System.out.println(h != i); // not equal to
    System.out.println(h >= i); // greater than or equal to
    System.out.println(h <= i); // less than or equal to

    // Logical Operators
    int j = 3;
    System.out.println(j > 5 && j < 10); // Logical AND - returns true if both conditions are true
    System.out.println(j > 5 || j < 10); // Logical OR - returns true if one condition is true
    System.out.println(!(j >5 && j < 10)); // Logical NOT - returns true if the condition is false, reverses the result of the condition
  }

}