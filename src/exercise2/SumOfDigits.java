package exercise2;
import java.util.Scanner; 
public  class SumOfDigits { 
  public static void main (String[] args) {
    System.out.println ("eine Zahl zwischen 0 und 999 eingeben");
    Scanner input = new Scanner (System.in);
    int number = input.nextInt(); 
    int b1=number%10;
    int a=number/10 ;
    int b2= a%10 ;
    int a2= a/10; 
    int b3=a2%10; 
    System.out.println(b1+b2+b3); 
    }
