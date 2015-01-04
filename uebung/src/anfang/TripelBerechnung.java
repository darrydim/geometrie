package anfang;
import java.util.Scanner;
	public class TripelBerechnung {
		public static void main(String [] args){
				Scanner sc = new Scanner (System.in);
				int a, b, c, max;
				System.out.println("Geben Sie einen Maximalwert!");
				max = sc.nextInt();
				for (a=1; a <=max; a++) {
					for (b = a+1; b<=max; b++){
						for (c = b+1; c<=max; c++){
							if(a*a + b*b == c*c){
							System.out.println(a+" "+b+" "+c);
							}
						}
					}
				}
		}
	}	
					