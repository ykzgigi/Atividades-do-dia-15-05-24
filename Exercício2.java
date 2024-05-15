package AtividadeDia15do05;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int m [][] = new int [4][4];


		//Entrada de dados

		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {

				if (i==j) {
					m[i][j] = (int)Math.round(Math.random()*100);
				}
			}
		}

		//Saída de dados
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.println(" Os valores são " +i+", "+j+"  "+ m[i][j]);
			}
		}

		ler.close();
	}

}


