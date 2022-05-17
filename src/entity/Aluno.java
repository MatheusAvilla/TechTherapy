
package entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Aluno extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column(name = "plano de pagamento")
    private float planoPagamento;
    
    @Column(name = "dias da semana")
    private String diasSemana;
    
    @Column(name = "horario")
    private java.sql.Timestamp horario;
    
    @Column(name = "senha de entrada")
    private String hash;
    
    @ManyToMany
    List<Professor> lstProfessores;

    public Aluno() {
    }

    public Aluno(String nome, String cpf, String email, String numero, int idade, int id, float planoPagamento, String diasSemana, Timestamp horario, String hash) {
        super(nome, cpf, email, numero, idade);
        this.id = id;
        this.planoPagamento = planoPagamento;
        this.diasSemana = diasSemana;
        this.horario = horario;
        this.hash = hash;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPlanoPagamento() {
        return planoPagamento;
    }

    public void setPlanoPagamento(float planoPagamento) {
        this.planoPagamento = planoPagamento;
    }

    public String getDiasSemana() {
        return diasSemana;
    }

    public void setDiasSemana(String diasSemana) {
        this.diasSemana = diasSemana;
    }

    public java.sql.Timestamp getHorario() {
        return horario;
    }

    public void setHorario(java.sql.Timestamp horario) {
        this.horario = horario;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
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
        if (!(object instanceof Aluno)) {
            return false;
        }
        Aluno other = (Aluno) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Aluno[ id=" + id + " ]";
    }
    
}
