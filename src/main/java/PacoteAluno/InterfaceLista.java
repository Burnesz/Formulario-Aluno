
package PacoteAluno;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.List;


public class InterfaceLista extends javax.swing.JFrame {
    public InterfaceLista(List<Aluno> alunos, String mat) {
        initComponents(alunos, mat);
        setLocationRelativeTo(null);
    }

    private void initComponents(List<Aluno> alunos, String mat) {
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Alunos");
        String tam = Integer.toString(alunos.size());
        
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        
        StringBuilder sb = new StringBuilder();
        for (Aluno aluno : alunos) {
            String dataForm = data.format(aluno.getDataNasc());
            if (aluno.getMat().equals(mat)){
                sb.append("Matrícula: ").append(aluno.getMat()).append("\n");
                sb.append("Nome: ").append(aluno.getNome()).append("\n");
                sb.append("CPF: ").append(aluno.getCpf()).append("\n");
                sb.append("Telefone: ").append(aluno.getTel()).append("\n");
                sb.append("Data de Nascimento: ").append(dataForm).append("\n");
                sb.append("Idade: ").append(aluno.getIdade()).append("\n");
            }
        }
        sb.append("Atualmente temos: ").append(tam).append(" alunos na lista");
        
        textArea.setText(sb.toString());
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);
        
        setSize(400, 300);
    }
}
