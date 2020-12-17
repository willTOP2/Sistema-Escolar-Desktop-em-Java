/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.educacional;

import Model.Conexao_bd;
import Views.TelaLogin;
import Views.telainicial;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Willian
 */
public class SistemaEducacional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try { 
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
   } catch(Exception ignored){
      }
        TelaLogin te= new TelaLogin();
        te.show();
        //telainicial t = new telainicial();
             
       // t.show();
       
       
      
        
    }
    
}
