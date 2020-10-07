package exercise2; 
import java.util.Scanner; 
public class Circle { 
public static void main(String[]args) {
  System.out.println ("r:");
  Scanner input = new Scanner(System.in); 
  int r = input.nextInt();
  double c =2*Math.PI*r;
  double b = Math.PI *(r*r); 
  System.out.println("Circumference" + c); 
  System.out.println("Area"+ b);








}





} 