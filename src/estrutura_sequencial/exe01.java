package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exe01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses 
		números com uma mensagem explicativa, conforme exemplos.*/
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int soma = num1+ num2;
		
		System.out.println("A soma do número 1 com o número 2 é: " + soma);
		
		sc.close();
	}

}
