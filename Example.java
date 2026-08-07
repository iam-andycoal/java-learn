public class Example
{
  public static void main(String[] args)
  {
    //Printing a string - uses double quotes
    System.out.println("This is an example Java program. It prints different types of data to the console.");

    //Printing integer
    System.out.println(5);

    //Adding integers and printing the result
    System.out.println(5 + 5);

    //Printing a floating point number
    System.out.println(5.5);

    //Adding floating point numbers and printing the result
    System.out.println(5.5 + 5.5);

    //Printing a character - uses single quotes
    System.out.println('A');

    //Printing the sum of two characters - will print the sum of their ASCII values
    System.out.println('A' + 'B');

    //Printing a boolean value
    System.out.println(true);

    //Mixing strings and numbers
    String car = "Toyota";
    int model_year = 2000;
    System.out.println("The " + car + " was manufactured in " + model_year);

    //Multiple variables in one line
    int a = 2, b = 3, c = 4;
    System.out.println(a + b + c);

    //One value to multiple variables
    int d, e, f;
    d = e = f = 5;
    System.out.println(d + e + f);
  }
}