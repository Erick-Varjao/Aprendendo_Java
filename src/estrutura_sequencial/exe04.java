package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exe04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Faça um programa que leia o número de um funcionário, seu número de horas trabalhadas,
		o valor que recebe por hora e calcula o salário desse funcionário.
		A seguir, mostre o número e o salário do funcionário, com duas casas decimais.*/
		
		int numFuncionario = sc.nextInt();
		double numHorasTrabalhadas = sc.nextDouble();
		double valorPorHora = sc.nextDouble();
		
		double salario = numHorasTrabalhadas * valorPorHora;
		
		System.out.println("Number: " + numFuncionario);
		System.out.printf("Salary: U$ %.2f%n", salario);
		
		sc.close();
	}

}
