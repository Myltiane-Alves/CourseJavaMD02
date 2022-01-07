package md02;

import java.util.Locale;
import java.util.Scanner;

public class exerc01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if (N < 0) {
		
			System.out.println("Negativo");
			
		} else {
			System.out.println("Positivo");
			
		}
		sc.close();
	}

}
