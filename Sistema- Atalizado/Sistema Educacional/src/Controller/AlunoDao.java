/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AlunosModel;
import Model.Conexao_bd;
import Model.Disciplina;

import Views.Alunos;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.swing.JOptionPane;




/**
 *
 * @author Willian
 */
public class AlunoDao extends Conexao_bd  {
    
 
    PreparedStatement pst =null;
    private AlunosModel aluno;
    
    
    
    
    
    
    public  void InserirAluno(AlunosModel aluno){
        conecta();
    
        try {
              //SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
               PreparedStatement pst = conexao.prepareStatement("insert into aluno(cod_aluno,nome_aluno,sobrenome,rg_aluno,data_nasc,sexo) values(default,?,?,?,?,?)");
   
          
               
             
                pst.setString(1, aluno.getNome());
                pst.setString(2, aluno.getSobrenome());
                pst.setString(3, aluno.getRg());
                pst.setString(4, aluno.getData());
                pst.setString(5, aluno.getSexo());
              
              
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
                    JOptionPane.showMessageDialog(null, "Dê dois clique na tabela caso deseja cadastrar o aluno na disciplina" ,"informação",JOptionPane.INFORMATION_MESSAGE );
                pst.close();

           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "erro no Dao" +ex);
           }

             desconecta();

       }
    

        public ArrayList<AlunosModel> Listar(String nome){ 
            
            ArrayList<AlunosModel> listaa1= new ArrayList<>();
            conecta();

            try {
                pst = conexao.prepareStatement("select* from aluno where nome_aluno ilike'"+
                        nome+ "%'");
                rs =pst.executeQuery();
                while(rs.next()){

                    AlunosModel a = new AlunosModel();
                   // a.setCod(rs.getInt("cod_aluno"));
                    a.setNome(rs.getString("nome_aluno"));
                    a.setRg(rs.getString("rg_aluno")); 
                    a.setSobrenome(rs.getString("sobrenome")); 
                    a.setData(rs.getString("data_nasc"));
                    a.setSexo(rs.getString("sexo"));
                  
                    listaa1.add(a);

                    
                }



            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"erro no dao" +ex);
            }

          
           
            return listaa1;
            
     }

     
        public ArrayList<AlunosModel> ListarRG(String rg){ 
            
            ArrayList<AlunosModel> listaa= new ArrayList<>();
           conecta();
   
            try {
                pst = conexao.prepareStatement("select* from aluno where rg_aluno='"+rg+ "'");
                rs =pst.executeQuery();
                
             
                while(rs.next()){

                    AlunosModel a = new AlunosModel();
                    a.setNome(rs.getString("nome_aluno"));
                    a.setRg(rs.getString("rg_aluno")); 
                    a.setSobrenome(rs.getString("sobrenome")); 
                    a.setData(rs.getString("data_nasc"));
                   
                
               listaa.add(a);
                }
                
                
     

            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"erro no dao" +ex);
            }
       
       // pst.close();
       
                     return listaa;
                 
                
          
            
     }
        
        public boolean ExcluirAluno(String rg){
             conecta();
        
        try {
            stmt =conexao.createStatement();
            String sql = "delete  from aluno where rg_aluno='"+rg+ "'";
            stmt.executeUpdate(sql);
            String sql1 = "update aluno set cod_aluno =0 where rg_aluno ='"+rg+"'";
            stmt.executeUpdate(sql1);
            
            stmt.close();
            desconecta();
        
           
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "erro" +ex);
        
            
            return false;
            
          
        }
        return true;
            
            
        }
        
        
        public  void AlterarAluno(AlunosModel aluno){
            conecta();
            try {
               pst = conexao.prepareStatement("update aluno set nome_aluno =?, sobrenome=?, data_nasc=? where rg_aluno =?" );
               
                pst.setString(1, aluno.getNome());
                     pst.setString(2, aluno.getSobrenome());
                pst.setString(3, aluno.getData());
                 pst.setString(4, aluno.getRg());
                pst.executeUpdate();
                pst.close();
                     JOptionPane.showMessageDialog(null,"Alterado com sucesso" );
                desconecta();
            } catch (SQLException e) {
                
                JOptionPane.showMessageDialog(null,"erro no AlterarAluno" +e);
            }
            
            
            
            
            
        }
         public void teste(String nome){
             conecta();
                try {
             
            String sql ="select id_sala from sala where nome_sala ='" +nome+ "'";
       
            pst.executeQuery(sql);
           
           
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
     


    }
