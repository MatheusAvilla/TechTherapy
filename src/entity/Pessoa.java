//
//package entity;
//
//import java.io.Serializable;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Inheritance;
//import javax.persistence.InheritanceType;
//
//
//@Entity
//@Inheritance(strategy=InheritanceType.JOINED)
//public class Pessoa implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//   
//    @Column(name = "nome")
//    private String nome;
//    
//    @Column(name = "cpf")
//    private String cpf;
//    
//    @Column(name = "email")
//    private String email;
//    
//    @Column(name = "telefone")
//    private String numero;
//    
//    @Column(name = "idade")
//    private int idade;
//    
//    @Column(name = "dias da semana")
//    private String diasSemana;
//
//    public Pessoa() {
//    }
//
//    public Pessoa(String nome, String cpf, String email, String numero, int idade, String diasSemana) {
//        this.nome = nome;
//        this.cpf = cpf;
//        this.email = email;
//        this.numero = numero;
//        this.idade = idade;
//        this.diasSemana = diasSemana;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getCpf() {
//        return cpf;
//    }
//
//    public void setCpf(String cpf) {
//        this.cpf = cpf;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getNumero() {
//        return numero;
//    }
//
//    public void setNumero(String numero) {
//        this.numero = numero;
//    }
//    
//    public int getIdade() {
//        return idade;
//    }
//
//    public void setIdade(int idade) {
//        this.idade = idade;
//    }
//    
//    public String getDiasSemana() {
//        return diasSemana;
//    }
//
//    public void setDiasSemana(String diasSemana) {
//        this.diasSemana = diasSemana;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (int) id;
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Pessoa)) {
//            return false;
//        }
//        Pessoa other = (Pessoa) object;
//        if (this.id != other.id) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "entity.Pessoa[ id=" + id + " ]";
//    }
//
//}
