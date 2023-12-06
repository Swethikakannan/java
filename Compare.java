public class Compare{
 public static void main(String[] args){

Integer num1 = new Integer(5);
Integer num2 = new Integer(5);

if (num1.intValue() == num2.intValue()) {  // this works as expected
    System.out.println("The numbers are equal.");
} else {
    System.out.println("The numbers are not equal.");
}