package estruturaPosCondicionada;

import java.util.Scanner;

public class SomaDosNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler= new Scanner(System.in);
		int i=1 , num = 0;
		while(i <=10) {
			System.out.println("Escreva um numero");
			num +=ler.nextInt();
			i++;
			
		}
		System.out.println("A soma dos números é:"+ num);
	
		ler.close();
	}

}
