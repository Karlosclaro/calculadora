package br.com.dio.model;

                   import java.util.Objects;

public class Gato {

private String nome;
                  private String Cor;
private Integer idade;

public Gato() {}

                public Gato(String nome, String cor, Integer idade) {
	this.nome = nome;
	Cor = cor;
	this.idade = idade;
	
	
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCor() {
	return Cor;
}

public void setCor(String cor) {
	Cor = cor;
}

public Integer getIdade() {
	return idade;
}

public void setIdade(Integer idade) {
	this.idade = idade;
}

@Override
public int hashCode() {
	return Objects.hash(Cor, idade, nome);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Object other;
	return Objects.equals(Cor, other.Cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	Gato other1 = (Gato) obj;
}

@Override
public String toString() {
	return "Gato [nome=" + nome + ", Cor=" + Cor + ", idade=" + idade + "]";
}


}

/*public Gato(String nome, String cor, Integer idade) {
	this.nome= nome;
	this.Cor = cor;
	this.idade = idade;
}*/



