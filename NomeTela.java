package estruturaPosCondicionada;

import java.util.Scanner;

public class NomeTela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner (System.in);
		int repeticao = 1;
		String nome;

		System.out.println("Qual o seu nome?");
		nome= ler.nextLine();

		while(repeticao<=10) {
			System.out.println(nome);
			repeticao++;
		}
		
		ler.close();

	}
}