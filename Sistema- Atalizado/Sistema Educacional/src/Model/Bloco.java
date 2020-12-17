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
public class Bloco {
    private int idBloco;
   
    private Sala sala;
    
  
    private String nomeBloco;

    public Bloco(int idBloco, Sala sala, String nomeBloco) {
        this.idBloco = idBloco;
        this.sala = sala;
        
       
        this.nomeBloco = nomeBloco;
    }

    public Bloco() {
    }

    public int getIdBloco() {
        return idBloco;
    }

    public void setIdBloco(int idBloco) {
        this.idBloco = idBloco;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    
    

    public String getNomeBloco() {
        return nomeBloco;
    }

    public void setNomeBloco(String nomeBloco) {
        this.nomeBloco = nomeBloco;
    }
    
    
}
