import java.util.Random;
import java.util.Scanner;

public class BolsaValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz1 = new int[4][7];
		int vetor1[] = new int[8];
		int menorMedia = 101;
		int maiorMedia = 0;
		int maiorMediaMensal = 0;
		int menorMediaMensal = 101;
		Random aleatorio = new Random();
		int contVetor = 0;

		for (int linha = 0; linha <= matriz1.length - 1; linha++) {
			for (int coluna = 0; coluna <= matriz1[0].length - 1; coluna++) {
				matriz1[linha][coluna] = aleatorio.nextInt(100);
				if (matriz1[linha][coluna] < menorMedia) {
					menorMedia = matriz1[linha][coluna];

				} else if (matriz1[linha][coluna] > maiorMedia) {
					maiorMedia = matriz1[linha][coluna];

				}

			}
			System.out.println("Menor Media da semana " + linha + ": " + menorMedia + ".");
			vetor1[contVetor] = menorMedia;
			contVetor++;
			System.out.println("Maior Media da semana " + linha + ": " + maiorMedia + ".");
			vetor1[contVetor] = maiorMedia;
			contVetor++;

			maiorMedia = 0;
			menorMedia = 101;
		}

		for (int linha = 0; linha <= matriz1.length - 1; linha++) {
			for (int coluna = 0; coluna <= matriz1[0].length - 1; coluna++) {
				System.out.print(matriz1[linha][coluna] + " ");
			}
			System.out.println("\n");
		}

		for (int coluna = 0; coluna <= 7; coluna++) {
			if (vetor1[coluna] < menorMediaMensal) {
				menorMediaMensal = vetor1[coluna];
			} else if (vetor1[coluna] > maiorMediaMensal) {
				maiorMediaMensal = vetor1[coluna];
			}
		}
		System.out.println("\n");

		System.out.println("Menor Media Mensal: " + menorMediaMensal + ".");
		System.out.println("Maior Media Mensal: " + maiorMediaMensal + ".");
	}
}
