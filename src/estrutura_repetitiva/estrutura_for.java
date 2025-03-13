package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class estrutura_for{
	
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	/*Criar um programa que lê um valor inteiro N e depois N números inteiros.
	  Ao final, mostrar a soma dos N números lidos*/
	
	int num;
	System.out.println("Quantidade de números que vai ser digitadas: ");
	num = sc.nextInt();
	
	int contador = 0;
	for (int i=0; i<num; i++) {
		int x = sc.nextInt();
		contador = contador + x;
	}
	
	System.out.println(contador);
	
	sc.close();
	}
}
