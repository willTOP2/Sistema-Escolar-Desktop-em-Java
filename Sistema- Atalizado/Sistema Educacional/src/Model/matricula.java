/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Willian
 */
public class matricula {
    
    private String situacao;
    private AlunosModel aluno;
    private int idRegistro;

    public matricula(String situacao, AlunosModel aluno, int idRegistro) {
        this.situacao = situacao;
        this.aluno = aluno;
        this.idRegistro = idRegistro;
    }

    public matricula() {
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public AlunosModel getAluno() {
        return aluno;
    }

    public void setAluno(AlunosModel aluno) {
        this.aluno = aluno;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }
    
    
    
}
