
package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Professor extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "salario")
    private float salario;
    
    @Column(name = "dia da semana")
    private String diaSemana;
    
    @ManyToMany
    List<Aluno> lstAlunos;
    
    public Professor() {
    }

    public Professor(String nome, String cpf, String email, String numero, int idade, int id, float salario, String diaSemana) {
        super(nome, cpf, email, numero, idade);
        this.id = id;
        this.salario = salario;
        this.diaSemana = diaSemana;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Professor)) {
            return false;
        }
        Professor other = (Professor) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Professor[ id=" + id + " ]";
    }
    
}
