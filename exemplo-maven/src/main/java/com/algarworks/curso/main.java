package com.algarworks.curso;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		try ( Scanner entrada = new Scanner(System.in)){
			System.out.print("Informe o seu nome: ");
			String nome = entrada.nextLine();
			
			System.out.print("Informe a sua idade: ");
			int idade = entrada.nextInt();
			
			Usuario usuario = new Usuario(nome, idade);
			System.out.println("Obrigado " + usuario.getNome() + " por se cadastrar ");
			
		}

	}

}
