package estruturaPosCondicionada;

import java.util.Scanner;

public class exercicios6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler= new Scanner(System.in);
		int numero,i = 1;
		String  nome;
		System.out.println("Qual o seu nome?");
		nome = ler.nextLine();
		System.out.println("Informe um número");
		numero = ler.nextInt();
		
		while (i <= numero) {
			System.out.println(nome);
			i++;
		}
		ler.close();
	}

}
