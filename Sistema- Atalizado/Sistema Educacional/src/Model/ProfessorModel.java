/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Gabriel
 */
public class ProfessorModel {
    
        private int codprof;
        private String nome;
        private String cpf;
        private String login;
        private String senha;
        private String perfil;

    public ProfessorModel(String nome, String cpf, String login, String senha, String perfil) {
        this.nome = nome;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    public ProfessorModel() {
        //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getCpf() {
        return cpf;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getPerfil() {
        return perfil;
    }
        
        
      

        
    
    
}
