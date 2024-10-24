/*Contagem de Múltiplos: Peça um número e conte quantos múltiplos de 3 
 * existem entre 1 e 100.
 */

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("digite um numero: ");
		int numero = scanner.nextInt();

		int contador = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				contador++;
			}
		}
		System.out.println("existem " + contador + " multiplos de 3 entre 1 e 100. ");
	}
}