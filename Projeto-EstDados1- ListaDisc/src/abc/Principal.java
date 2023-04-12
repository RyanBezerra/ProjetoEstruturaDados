package abc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int i = 1;
		int contDisc = 0;
		while (i == 1) {
		System.out.println("criar nova disciplina? \n[1] Sim\n[2] Não");
		
		Scanner tec = new Scanner (System.in);;
		i = tec.nextInt();
		
			Disciplina novaDisc = new Disciplina();
			novaDisc.criaDisc();
			novaDisc.getNome();
			novaDisc.getNota();
			
			
			
			
		}
		
	
		if(i!= 1) {
		System.out.println("Programa encerrado");
		}
	
	}
}
   

