package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class exe_while003 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. 
		Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2
		.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser 
		solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for
		o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram 
		cada tipo de combustível, conforme exemplo.*/
		
		int escolha;
		
		System.out.println("====Bem-vindo ao posto do seu Zé===");
		System.out.println("Escolha sua opção: \n 1 = Álcool"
				          +"                   \n 2 = Gasolina"
				          +"                   \n 3 = Diesel"
				          +"                   \n 4 = Fim");
		escolha = sc.nextInt();
		
		int alcool = 0, gasolina = 0, diesel = 0;
		
		while(escolha != 4) {
			if(escolha < 1 || escolha > 4) {
				System.out.println("Código Inválido, Digite novamente: ");
				} else if (escolha == 1) {
					System.out.println("Álcool");
					alcool = alcool + 1;
					System.out.println("Próximo Cliente: ");
				} else if (escolha == 2) {
					System.out.println("Gasolina");
					gasolina = gasolina + 1;
					System.out.println("Próximo Cliente: ");
				} else if (escolha == 3) {
					System.out.println("Diesel");
					diesel = diesel + 1;
					System.out.println("Próximo Cliente: ");
				}
			escolha = sc.nextInt();
		}
		System.out.println("Muito obrigado por abastecer no nosso posto!!");
		System.out.println("Total de clientes que abasteceram com Álcool " + alcool);
		System.out.println("Total de clientes que abasteceuram com Gasolina " + gasolina);
		System.out.println("Total de clientes que abasteceuram com Diesel " + diesel);
		
		sc.close();
	}
}
