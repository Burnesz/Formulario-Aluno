package PacoteAluno;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "aluno")
public class AlunoBD {
    @Id
    private String mat;
    private String nome;
    private int idade;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNasc;
    private String tel;
    private String cpf;
    
    public AlunoBD() {
       
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
