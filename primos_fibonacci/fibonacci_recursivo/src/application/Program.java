package application;

import java.util.Scanner;

public class Program {

	// Função fib
	public static int fib(int n) {
		// validar a entrada
		if (n <= 1) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder line = new StringBuilder();

		int n;
		System.out.println("===Sequencia de Fibonacci===");
		System.out.print("Digite um valor para n:");

		n = sc.nextInt();

		System.out.println("Sequência de Fibonacci com " + n + " termos:");
		for (int i = 0; i < n; i++) {
			line.append(String.format("fib(%d) = %d ; ", i, fib(i)));
		}
		System.out.println(line.toString());

		sc.close();
	}

}