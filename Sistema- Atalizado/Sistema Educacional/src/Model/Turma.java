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
public class Turma {
    
    private String turno;
    private String Turma_tipo;
    private AlunosModel aluno;
 

    public Turma(String turno, String Turma_tipo, AlunosModel aluno) {
        this.turno = turno;
        this.Turma_tipo = Turma_tipo;
        this.aluno = aluno;
       
    }

    

    public Turma() {
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTurma_tipo() {
        return Turma_tipo;
    }

    public void setTurma_tipo(String Turma_tipo) {
        this.Turma_tipo = Turma_tipo;
    }

    public AlunosModel getAluno() {
        return aluno;
    }

    public void setAluno(AlunosModel aluno) {
        this.aluno = aluno;
    }
    
    
    
    
    
}
