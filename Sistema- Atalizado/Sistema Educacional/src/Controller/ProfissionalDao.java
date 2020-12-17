
package Controller;

import Model.Conexao_bd;
import Model.ProfissionalModel;
import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 *
 * @author Gabriel
 */
public class ProfissionalDao extends Conexao_bd{
    
   PreparedStatement pst;
    
    
    
    
    
    public void Inserir_Profissional (ProfissionalModel prof ){
        conecta();
        
        try {
            PreparedStatement pst = conexao.prepareStatement("INSERT INTO PROFISSIONAL(cod_prof, nome_prof, cpf, senha, login, perfil)"
                    + " values(default,?,?,?,?,?); ");
                    pst.setString(1, prof.getNome());
                    pst.setString(2, prof.getCpf());
                     pst.setString(3, prof.getSenha());
                    pst.setString(4, prof.getLogin());
                    pst.setString(5, prof.getPerfil());
                    pst.execute();
                    pst.close();
                    JOptionPane.showMessageDialog(null, "Cadastrado!"); 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Verificar"+e);
            
        }
        
     }   
        
    public void Atualizar_Profissional (ProfissionalModel prof){
            conecta();
            
           try {
            PreparedStatement pst = conexao.prepareStatement("UPDATE PROFISSIONAL SET nome_prof = ?, cpf = ?, senha =?, login=?, perfil=?"+
                    "WHERE cpf =?");
                     pst.setString(1, prof.getNome());
                    pst.setString(2, prof.getCpf());
                     pst.setString(3, prof.getSenha());
                    pst.setString(4, prof.getLogin());
                    pst.setString(5, prof.getPerfil());
                    pst.setString(6, prof.getCpf());
                    JOptionPane.showMessageDialog(null, "Profissional Atualizado");
                    pst.executeUpdate();
                    pst.close();
                    
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,"Verificar Atualizar_Profissional    "+ e);
        }
 
    
    
    } 
    
    
    
    public void Excluir_Profissional(String prof){
        conecta();
            
        try {
            PreparedStatement pst = conexao.prepareStatement("DELETE FROM PROFISSIONAL WHERE cpf ='"+prof +"'");
            pst.executeUpdate();
            pst.close();
             JOptionPane.showMessageDialog(null,"Profissional Excluído");
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null,"Verificar Excluir_Profissional    "+ e);
        }
    
    
    
    
    }
         
     
        
    public ArrayList<ProfissionalModel> mostrar_prof(String nomeProf){
            
            ArrayList<ProfissionalModel> list = new ArrayList<>();
            conecta();
         
            try {
                pst = conexao.prepareStatement("Select * from profissional where nome_prof ilike'%"+ 
                        nomeProf+"%'");
                rs =pst.executeQuery();
                
                while(rs.next()){
                    ProfissionalModel profissional = new ProfissionalModel();
                    profissional.setNome(rs.getString("nome_prof"));
                    profissional.setCpf(rs.getString("cpf"));
                    profissional.setSenha(rs.getString("senha"));
                    profissional.setLogin(rs.getString("login"));
                    profissional.setPerfil(rs.getString("perfil"));
                    
                    list.add(profissional);
                }
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Verificar mostra_prof "+e);
                
            }
            
            return list;
            
    }
        
        
        
        
       
}
