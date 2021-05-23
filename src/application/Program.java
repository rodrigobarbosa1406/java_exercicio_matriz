package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de linhas: ");
		int linhas = sc.nextInt();
		
		System.out.print("Digite a quantidade de colunas: ");
		int colunas = sc.nextInt();
		
		System.out.println();
		
		int[][] mat = new int[linhas][colunas];
		
		for (int i=0; i<mat.length; i++) {
			System.out.println("VALORES DA LINHA " + (i + 1));
			
			for (int j=0; j<mat[i].length; j++) {
				System.out.print("Informe os valores da coluna " + (j + 1) + ": ");
				mat[i][j] = sc.nextInt();
			}
			
			System.out.println();
		}
		
		System.out.print("Informe o número que deseja encontrar: ");
		int busca = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == busca) {
					System.out.println("POSIÇÃO " + i + "," + j + ":");
					
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][(j - 1)]);
					}
					
					if ((j + 1) < mat[i].length) {
						System.out.println("Direita:  " + mat[i][(j + 1)]);
					}
					
					if (i > 0) {
						System.out.println("Acima:    " + mat[(i - 1)][j]);
					}
					
					if ((i + 1) < mat.length) {
						System.out.println("Abaixo:   " + mat[(i + 1)][j]);
					}
				}
			}
			
			System.out.println();
		}
		
		sc.close();
	}

}
