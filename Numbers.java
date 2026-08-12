public class Numbers 
{
  public static void main(String[] args) 
  {
    //byte data type can store whole numbers from -128 to 127
    byte myNum = 100;
    System.out.println(myNum);

    //short data type can store whole numbers from -32,768 to 32,767
    short myNum2 = 5000;
    System.out.println(myNum2);

    /*int data type can store whole numbers from -2,147,483,648 to 2,147,483,647
    int is the most commonly used data type for whole numbers*/
    int myNum3 = 100000;
    System.out.println(myNum3);

    long myNum4 = 15000000000L;
    System.out.println(myNum4);

    //float and double data types can store fractional numbers (numbers with decimals)
    float myNum5 = 35e3f; // f at the end is optional
    System.out.println(myNum5);

    //double has a precision of 15 digits, while float has a precision of 7 digits
    double myNum6 = 12E4d; // d at the end is optional
    System.out.println(myNum6);
  }
}