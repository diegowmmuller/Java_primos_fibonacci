package application;

import java.util.Scanner;

public class Program {

	public static int fib(int n) {
		// validar a entrada
		if (n <= 1) {
			return n;
		}
		int a = 0, b = 1, c = 0;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder line = new StringBuilder();

		System.out.println("===Sequencia de Fibonacci===");
		System.out.print("Digite um valor para n:");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("fib(%d) = %d", i, Program.fib(i));
		}

		sc.close();
	}

}
