package PacoteAluno;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno {
    
    private String mat;
    private String nome;
    private int idade;
    private Date dataNasc;
    private String tel;
    private String cpf;

    public Aluno(String mat, String nome, String cpf, String tel, String dataNasc, int idade) throws ParseException {
        this.mat = mat;
        this.nome = nome;
        this.idade = idade;
        this.setDataNasc(dataNasc); 
        this.cpf = cpf;
    }
    
    public Aluno(){
    
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
        if (idade < 100) {
            this.idade = idade;
        } else {
            throw new IllegalArgumentException("Idade deve ter no máximo 2 dígitos.");
        }
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setDataNasc(String dataNasc) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        this.dataNasc = sdf.parse(dataNasc);
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
