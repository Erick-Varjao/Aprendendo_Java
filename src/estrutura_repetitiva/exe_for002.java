package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class exe_for002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos
		  em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão
		  fora do intervalo, mostrando essas informações conforme exemplo
		  (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo)*/
		
		int in = 0, out = 0;
		int valor_n;
		System.out.println("Quantidade de números que será digitados: ");
		valor_n = sc.nextInt();
		
		for(int i=0; i < valor_n; i++) {
			int x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
		}	
			System.out.println("Total de valores dentro(In) do intervalo de 10 a 20: " + in);
			System.out.println("Total de valores fora(Out):" + out);
		sc.close();
	}
}
