package abc;

import java.util.Scanner;

public class Disciplina {
	private String nomeDisciplina;
	private Double notaDisciplina;
	public Scanner entrada = new Scanner(System.in);
	
	public void criaDisc(){
	System.out.println("nome: ");	
	nomeDisciplina = entrada.nextLine();
	System.out.println("nota: ");
	notaDisciplina = entrada.nextDouble();
	
	}
	public String getNome() {
		System.out.println(nomeDisciplina);
		return this.nomeDisciplina;
	}
	public Double getNota() {
		System.out.println(notaDisciplina);
		return this.notaDisciplina;
	}
	
}


