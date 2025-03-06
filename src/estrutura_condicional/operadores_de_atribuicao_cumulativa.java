package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class operadores_de_atribuicao_cumulativa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
		dá direito a 100 minutos de telefone. Cada minuto que exceder a
		franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
		quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
		a ser pago*/
		
		int minutos;
		System.out.println("Digite quantos minutos você usou o celular: ");
		minutos = sc.nextInt();
		
		double conta = 50.0;
		if(minutos > 100){
			conta += (minutos - 100) * 2.0;
		}
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		sc.close();
	}

}
