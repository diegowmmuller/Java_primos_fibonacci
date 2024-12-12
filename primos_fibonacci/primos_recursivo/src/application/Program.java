package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	
	public static boolean calculoPrimoRecursivo(int numero, int divisor) {
		if (numero<2) {
			return false;
		}
		
		if (divisor==1) {
			return true;
		}
		
		if (numero%divisor==0) {
			return false;
		}
		return calculoPrimoRecursivo(numero, divisor-1);
	}
	
	
	
	
	
	
	
	
	public static boolean calculoPrimo(int numero) {
		return calculoPrimoRecursivo(numero, numero-1);
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