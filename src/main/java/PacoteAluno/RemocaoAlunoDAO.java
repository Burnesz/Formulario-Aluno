/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PacoteAluno;

import java.util.List;

/**
 *
 * @author soare
 */
public class RemocaoAlunoDAO {
    public List<Aluno> removerAluno(List<Aluno> alunos, Aluno a) {
        alunos.remove(a);
        return alunos;
    }
}
