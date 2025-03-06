package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exe005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
		 A seguir, calcule e mostre o valor da conta a pagar.*/
		System.out.println("\n 1  Cachorro Quente  R$ 4.00 "
						  +"\n 2  X-Salada         R$ 4.50 "
						  +"\n 3  X-Bacon          R$ 5.00 "
						  +"\n 4  Torrada simples  R$ 2.00 "
						  +"\n 5  Refrigerante     R$ 1.50 ");
		int codigo,qtd;
		double total;
		
		System.out.println("Digite o código do produto...: ");
		codigo = sc.nextInt();
		System.out.println("Digite a quantidade...: ");
		qtd = sc.nextInt();
		
		if(codigo == 1) {
			total = qtd * 4.0;
		}
		else if(codigo == 2) {
			total = qtd * 4.5;
		}
		else if(codigo == 3) {
			total = qtd * 5.0;
		}
		else if(codigo == 4) {
			total = qtd * 2.0;
		}
		else {
			total = qtd * 1.5;
		}
		
		System.out.printf("Total: R$ %.2f%n" , total);
		sc.close();
	}

}
