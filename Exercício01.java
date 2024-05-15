package AtividadeDia15do05;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int m[][] = new int[5][5];

		int soma=0, valor;

		//Entrada de dados

		for(int i=0; i<5; i++) {

			for (int j=0; j<5; j++) {

				valor = (int)Math.round(Math.random()*100);

				if (valor % 2 ==0)

					m[i][j] = valor;

				soma= soma+m[i][j];
			}
		}
		//Saída de dados

		for(int i=0; i<5; i++) {

			for(int j=0; j<5; j++) {

				System.out.println("Os valores são " + m[i][j]);
			}

		}
		System.out.println("A soma é " + soma);

		ler.close();

	}

}