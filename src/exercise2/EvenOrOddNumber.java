package exercise2 ; 
import java.util.Scanner; 
public class EvenOrOddNumber{
  static void Zahl (int zahlWert);
  public static void main(String[]args){
  Scanner input = new.Scanner (System.in);
		int zahl = input.nextInt();
	if (zahl % 2 == 0) {
			System.out.println("Zahl ist gerade");
		}
		else {
			System.out.println("Zahl ist ungerade");
		}
			
	}
}
