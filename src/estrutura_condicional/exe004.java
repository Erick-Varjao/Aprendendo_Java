package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exe004 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
		 sabendo que o mesmo pode começar em um dia e terminar em outro, 
		 tendo uma duração mínima de 1 hora e máxima de 24 horas.*/
		
		int hora_inicio, hora_termino;
		System.out.println("Em que horas o jogo começou: ");
		hora_inicio = sc.nextInt();
		System.out.println("Em que horas o jogo terminou: ");
		hora_termino = sc.nextInt();
		
		int duracao;
		
		if(hora_inicio < hora_termino) {
			duracao = hora_termino - hora_inicio;
		}
		else {
			duracao = 24 - hora_inicio + hora_termino;
		}
		
		System.out.println("O jogo durou " + duracao + " Hora(s) ");
		
		sc.close();
	}

}
