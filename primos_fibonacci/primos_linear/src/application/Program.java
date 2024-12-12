package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	
	public static boolean calculoPrimo(int numero) {
		if (numero<2) {
			return false;
		}
		
		for(int i=2; i<numero; i++) {
			if(numero%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// um numero primo so e divisivel por 1 e por ele mesmo
		
		System.out.println("Digite um numero para N");
		int n = sc.nextInt();
		
		List<Integer> primos = new ArrayList<>();
		
		for(int i=1; i<=n; i++) {
			if (calculoPrimo(i)) {
				primos.add(i);
			}
		}
		
		for(int primo: primos) {
			System.out.println(primo);
		}
		
		sc.close();
	}

}
