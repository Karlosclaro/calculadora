package com;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.print(gato);
		System.out.println(livros);
		/*int a = 2;
		int b = 3;
		System.out.println("Alô Mundo vei! " + (a+b));*/
	}
	}


class livro {
	private String nome;
	private String npag;
}