package estruturaPosCondicionada;

import java.util.Scanner;

public class NumeroUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler= new Scanner(System.in);
		int i=1 , nome = 0;
		while(i <=10) {
			System.out.println("Escreva seu nome");
			nome =ler.nextInt();
			
			System.out.println("Quantas vezes você quer que repita seu nome?");
			i +=ler.nextInt();
	}

}
}