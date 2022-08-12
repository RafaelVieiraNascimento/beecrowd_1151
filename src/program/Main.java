package program;

/*
beecrowd | 1151 - Fibonacci Fácil

A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci.
Nessa sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores.
Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros números dessa série.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 46).

Saída
Os valores devem ser mostrados na mesma linha, separados por um espaço em branco.
Não deve haver espaço após o último valor.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int somaUm = 0;
		int somaDois = 1;
		int total = 1;

		int n = sc.nextInt();

		System.out.printf("%d ", 0);

		for (int i = 2; i <= n; i++) {
			if (i < n) {
				System.out.printf("%d ", total);
				total = somaUm + somaDois;
				somaUm = somaDois;
				somaDois = total;
			} 
			
			else System.out.println(total);
		}
		sc.close();
	}
}
