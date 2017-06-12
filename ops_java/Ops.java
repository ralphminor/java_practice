//filename: Ops.java
// define a class called Ops
public class Ops {

  // define a method called sum
  // this method returns an int
  // it has a parameter named x that is of type int
  // it has a parameter named y that is of type int
  public static int sum(int x, int y) {
    return x + y;
  }

  // main gets executed when we run this class with the java command
  public static void main(String [] args){

    // declare a variable called first of type int
    int first;

    //assign first a value of 1
    first = 1;

    // declare a variable called second of type int
    // assign it a value of 2
    int second = 2;

    // declare a variable called result of type int
    int result = sum(first, second);

    // print the value stored in variable result

    System.out.println(result);
  }

}