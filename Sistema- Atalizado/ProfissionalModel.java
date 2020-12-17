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
public class ProfissionalModel {
    
    private int cod;
    private String login;
    private String senha;
    private String perfil;
    private String cpf;
    private String nome;

     public ProfissionalModel(int cod, String nome, String cpf, String login, String senha, String perfil) {
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
        this.cpf = cpf;
        this.nome = nome;
        this.cod=cod;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

   
    public ProfissionalModel() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    
    
    
}
