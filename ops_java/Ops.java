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
    // invoke sum, passing in 1 and 2 as arguments and print the results
    System.out.println( sum(1, 2) );
  }

}