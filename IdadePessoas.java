package estruturaPosCondicionada;

import java.util.Scanner;

public class IdadePessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler= new Scanner(System.in);
		int  i= 0,idade, num = 0;
		while (i<=20) {
			System.out.println("Qual a sua idade?");
			idade =ler.nextInt();
			if (idade >= 18) {
				num++;
				
			}
		i++;

		}
	
		System.out.println(num+" pessoas são maiores de idade");
		ler.close();

	}

}
