/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.AlunoDao;
import java.sql.Date;
import javax.swing.JTextField;

/**
 *
 * @author Willian
 */
public class AlunosModel {
   
    private int cod;
    private String nome;
 private String sexo;
    private String sobrenome;
    private String rg;
   private String Data;

    public AlunosModel(String nome, String sexo, String sobrenome, String rg, String Data, int cod) {
        this.nome = nome;
        this.sexo = sexo;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.cod =cod;
        this.Data = Data;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

   
   
   

   

  
  

 

    public AlunosModel() {
     
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

 
  
    

 

  
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
   
  public void salvar(AlunosModel aluno){
    
  }
 
}
