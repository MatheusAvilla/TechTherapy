
package entity;


public abstract class Pessoa {
    
    String nome, cpf, email, numero;
    int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, String email, String numero, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.numero = numero;
        this.idade = idade;
    }
    
   
}
