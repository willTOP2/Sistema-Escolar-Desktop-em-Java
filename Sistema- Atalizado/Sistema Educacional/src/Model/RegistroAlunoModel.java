/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Views.Professores;

/**
 *
 * @author Willian
 */
public class RegistroAlunoModel {
    
    private Disciplina disciplina;
    private Turma turma;
    private AlunosModel aluno;
    private ProfissionalModel prof;
    private AlunosModel nome;
    
    private int cod;
    private int falta;
    private float nota1;
     private float nota2;
     private float nota3;
     private float nota4;
    private float mediafinal;
    
 

    public RegistroAlunoModel() {
    }

    public RegistroAlunoModel(Disciplina disciplina, Turma turma, AlunosModel aluno, ProfissionalModel prof,  int falta, float nota1, float nota2, float nota3, float nota4, float mediafinal, int cod) {
        this.disciplina = disciplina;
        this.turma = turma;
        this.aluno = aluno;
        this.prof = prof;
     this.cod=cod;
        this.falta = falta;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.mediafinal = mediafinal;
       
      
    }

    public ProfissionalModel getProf() {
        return prof;
    }

    public void setProf(ProfissionalModel prof) {
        this.prof = prof;
    }

    public int getCod() {
        return cod;
    }

    public AlunosModel getNome() {
        return nome;
    }

    public void setNome(AlunosModel nome) {
        this.nome = nome;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public AlunosModel getAluno() {
        return aluno;
    }

    public void setAluno(AlunosModel aluno) {
        this.aluno = aluno;
    }

    public ProfissionalModel getProfessor() {
        return prof;
    }

    public void setProfessor(ProfissionalModel prof) {
        this.prof = prof;
    }

   

    public int getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNota4() {
        return nota4;
    }

    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }

    public float getMediafinal() {
        return mediafinal;
    }

    public void setMediafinal(float mediafinal) {
        this.mediafinal = mediafinal;
    }

    
   
    
}
