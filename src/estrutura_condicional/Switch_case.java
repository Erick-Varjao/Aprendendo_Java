package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da
		 * semana (sendo 1=domingo, 2=segunda, e assim por diante). Escrever na tela o
		 * dia da semana correspondente, conforme exemplos.
		 */

		int x;
		System.out.println("Digite o dia da semana: ");
		x = sc.nextInt();
		String dia;
		
		switch(x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-feira";
			break;
		case 3:
			dia = "Terça-feira";
			break;
		case 4:
			dia = "Quarta-feira";
			break;
		case 5:
			dia = "Quinta-feira";
			break;
		case 6:
			dia = "Sexta-feira";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Valor invalido";
			break;
		}
			
		System.out.println("Dia da semana: " + dia);
		sc.close();
	}

}
