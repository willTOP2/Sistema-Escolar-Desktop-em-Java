/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AlunosModel;
import Model.Bloco;
import Model.Conexao_bd;
import Model.Disciplina;
import Model.ProfissionalModel;
import Model.RegistroAlunoModel;
import Model.Sala;
import Model.Turma;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Willian
 */
public class EscolarDao extends Conexao_bd {
    
    
    
    
    public void InserirTurma(Turma tur){
            conecta();
            
      try {
        PreparedStatement pst = conexao.prepareStatement("insert into turma(turma_pk,turno) values(?,?)");
             pst.setString(1,tur.getTurma_tipo());
             
          
             pst.setString(2, tur.getTurno());
                
             pst.executeUpdate();
               
              JOptionPane.showMessageDialog(null, "cadastro com sucesso" );
             
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "nao cadastrou" +ex);
        }finally{
            desconecta();
        }
        
    }
    
    public void InserirSala(Sala sala){
        conecta();
        try {
      PreparedStatement pst= conexao.prepareStatement("insert into sala (id_sala,nome_sala,turma_pk) values(default,?,?)");
      
        pst.setString(1, sala.getNome_sala());
        pst.setString(2, sala.getTurma().getTurma_tipo());
            pst.executeUpdate();
            
              JOptionPane.showMessageDialog(null, "cadastro com sucesso" );
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "nao cadastrou" +ex);
        }finally{
            desconecta();
        }
        
        
    }
    
    
    
    public void InserirBloco(Bloco bloco){
        conecta();
          try {
      PreparedStatement pst= conexao.prepareStatement("insert into bloco (idbloco,id_sala,nome ) values(default,?,?)");
      
   
         pst.setInt(1, bloco.getSala().getIdSala());
         pst.setString(2, bloco.getNomeBloco());
                 
            pst.executeUpdate();
               
            JOptionPane.showMessageDialog(null, "cadastro com sucesso");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "nao cadastrou" +ex);
        }finally{
            desconecta();
        }
        
        
        
    }
    
      public void InserirDisicplina(Disciplina disc){
        conecta();
          try {
        PreparedStatement pst= conexao.prepareStatement("insert into  disicplina (iddisc, nome_disc) values(default,?)");
      
        pst.setString(1, disc.getNome());
      
            pst.executeUpdate();
            
               JOptionPane.showMessageDialog(null, "cadastrou");
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "nao cadastrou" +ex);
        }finally{
            desconecta();
        }
        
        
        
    }
    
    
      
    public void InserirResgistro(RegistroAlunoModel alu){
        conecta();
          try {
            
                
                
                
      PreparedStatement pst= conexao.prepareStatement("insert into turma_disc(idpk,turma_pk,cod_aluno,iddisc, cod_prof,falta,media_final,bimestre_1º,bimestre_2º,bimestre_3º,bimestre_4º) "
              + "values(default,?,?,?,?,?,?,?,?,?,?)");
      
        pst.setString(1, alu.getTurma().getTurma_tipo());
       
         pst.setInt(2, alu.getAluno().getCod());
        pst.setInt(3, alu.getDisciplina().getCod());
        pst.setInt(4,alu.getProfessor().getCod());
         pst.setInt(5, alu.getFalta());
         pst.setDouble(6, alu.getMediafinal());
         pst.setDouble(7, alu.getNota1());
         pst.setDouble(8, alu.getNota2());
          pst.setDouble(9, alu.getNota3());
         pst.setDouble(10, alu.getNota4());
      
 
                 
            pst.executeUpdate();
            
             JOptionPane.showMessageDialog(null, "cadastrou");
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "nao cadastrou" +ex);
        }finally{
            desconecta();
        }
    }
        
        public ArrayList<Disciplina> BuscarCodDisc(String nome){
       conecta();
            ArrayList<Disciplina> listaa1= new ArrayList<>();
        try {
            pst = conexao.prepareStatement("select iddisc,nome_disc from disicplina where nome_disc ilike'"+
                    nome+ "%'");
            rs =pst.executeQuery();
            
            while(rs.next()){

                Disciplina a = new Disciplina();
                  
                    a.setCod(rs.getInt("iddisc"));
                    a.setNome(rs.getString("nome_disc"));
                  
                  
                    listaa1.add(a);

            }
            
            
            
            } catch (SQLException ex) {
            Logger.getLogger(EscolarDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            return listaa1;
            
            
 
        }
        
        
        
        public ArrayList<Turma> BuscarCodTurma(String nome){
       conecta();
            ArrayList<Turma> listaa1= new ArrayList<>();
        try {
            pst = conexao.prepareStatement("select turma_pk from turma where turma_pk ilike'"+
                    nome+ "%'");
            rs =pst.executeQuery();
            
            while(rs.next()){

                Turma a = new Turma();
                  
                    a.setTurma_tipo(rs.getString("turma_pk"));
                  
                  
                    listaa1.add(a);

            }
            
            
            
            } catch (SQLException ex) {
            Logger.getLogger(EscolarDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            return listaa1;
            
            
            
            
        }
        
        
        
        public ArrayList<ProfissionalModel> BuscarCodProf(String nome){
       conecta();
            ArrayList<ProfissionalModel> listaa1= new ArrayList<>();
        try {
            pst = conexao.prepareStatement("select cod_prof from profissional where nome_prof ilike'"+
                    nome+ "%'");
            rs =pst.executeQuery();
            
            while(rs.next()){

                ProfissionalModel a = new ProfissionalModel();
                  
                    a.setCod(rs.getInt("cod_prof"));
                  
                  
                    listaa1.add(a);

            }
            
            
            
            } catch (SQLException ex) {
            Logger.getLogger(EscolarDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            return listaa1;
            
            
            
            
        }
        
        
        
        public ArrayList<AlunosModel> BuscarCodAluno(String rg){
       conecta();
            ArrayList<AlunosModel> listaa1= new ArrayList<>();
        try {
            pst = conexao.prepareStatement("select * from aluno where rg_aluno ilike'"+
                    rg+ "%'");
            rs =pst.executeQuery();
            
            while(rs.next()){

                AlunosModel a = new AlunosModel();
                  
                    a.setCod(rs.getInt("cod_aluno"));
                    a.setNome(rs.getString("nome_aluno"));
                  a.setSexo(rs.getString("sexo"));
                  a.setSobrenome(rs.getString("sobrenome"));
                  a.setData(rs.getString("data_nasc"));
                    a.setRg(rs.getString("rg_aluno"));
                    listaa1.add(a);

            }
            
            
            
            } catch (SQLException ex) {
            Logger.getLogger(EscolarDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            return listaa1;
            
            
            
            
        }
        
        
         public ArrayList<RegistroAlunoModel> BuscarCodREgistro(String reg){
       conecta();
            ArrayList<RegistroAlunoModel> listaa1= new ArrayList<>();
        try {
            pst = conexao.prepareStatement("select  cod_aluno, idpk from aluno natural join turma_disc where nome_aluno ilike'"+
                    reg+ "%'");
            rs =pst.executeQuery();
            
            while(rs.next()){

              RegistroAlunoModel a = new RegistroAlunoModel();
              
              AlunosModel b = new AlunosModel();
             
              
              b.setCod(rs.getInt("cod_aluno"));
                   a.setAluno(b);
                   a.setCod(rs.getInt("idpk"));
                    listaa1.add(a);

            }
            
            
            
            } catch (SQLException ex) {
            Logger.getLogger(EscolarDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            return listaa1;
            
            
            
            
        }
        
        
        public ArrayList<Sala> BuscarCodSala(String registro){
       conecta();
            ArrayList<Sala> listaa1 = new ArrayList<>();
        try {
            pst = conexao.prepareStatement("select id_sala from sala where nome_sala ilike'"+
                    registro+ "%'");
            rs =pst.executeQuery();
            
            while(rs.next()){

              Sala a = new Sala();
              
           
    
                   a.setIdSala(rs.getInt("id_sala"));
                    listaa1.add(a);

            }
            
            
            
            } catch (SQLException ex) {
            Logger.getLogger(EscolarDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            return listaa1;
            
            
            
            
        }
        
           
       /* public ArrayList<Turma> BuscarCodTurma(String registro){
       conecta();
            ArrayList<Turma> listaa1 = new ArrayList<>();
        try {
            pst = conexao.prepareStatement("select tumra_pk from turma where  turma_pk ilike'"+
                    registro+ "%'");
            rs =pst.executeQuery();
            
            while(rs.next()){

                Turma t = new Turma();
                 t.setTurma_tipo(rs.getString("turma_pk"));
           
    
                    listaa1.add(t);

            }
            
            
            
            } catch (SQLException ex) {
            Logger.getLogger(EscolarDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            return listaa1;
            
            
            
            
        }
        
        
        */
        
        
        
        
        
         
         public void InserirFaltas(RegistroAlunoModel reg, int id){
             conecta();
               try {
               pst = conexao.prepareStatement("update turma_disc set falta =? where idpk ='"+id+"'" );
              
                pst.setInt(1, reg.getFalta());
         
                pst.executeUpdate();
                pst.close();
                     JOptionPane.showMessageDialog(null,"Alterado com sucesso" );
                desconecta();
            } catch (SQLException e) {
                
                JOptionPane.showMessageDialog(null,"erro no AlterarAluno" +e);
            }
            
           
         }
        
           
        public  void InserirNotas(RegistroAlunoModel reg, int id){
            conecta();
            try {
       pst = conexao.prepareStatement("update turma_disc set bimestre_1º =?,  bimestre_2º=?, bimestre_3º=? , bimestre_4º=?, media_final=? where idpk ='"+id+"'" );
              
                pst.setFloat(1, reg.getNota1());
          
                 pst.setFloat(2, reg.getNota2());
                   pst.setFloat(3, reg.getNota3());
                  pst.setFloat(4, reg.getNota4());
                    pst.setFloat(5, reg.getMediafinal());
                pst.executeUpdate();
                pst.close();
                     JOptionPane.showMessageDialog(null,"cadastro nota com  sucesso" );
                desconecta();
            } catch (SQLException e) {
                
                JOptionPane.showMessageDialog(null,"erro no AlterarAluno" +e);
            }
            
        }
        
        
        public ResultSet BuscarU(RegistroAlunoModel r, Disciplina d){
            try{
          conecta();
                String sql = "select nome_disc, falta from tumra_disc natural join disicplina where idpk = '"+r.getCod()+"' and iddisc= '"+d.getCod()+"'";
            stmt.executeQuery(sql);
            rs = stmt.getResultSet();
                                
            
            return rs;                           
                    }
                catch(SQLException e){          
                    JOptionPane.showMessageDialog(null, "Erro ");
                    return null;
                }    
        }
            
            
         
         public ArrayList<RegistroAlunoModel> Buscar(String reg){
       conecta();
            ArrayList<RegistroAlunoModel> listaa1= new ArrayList<>();
        try {
            pst = conexao.prepareStatement("select  cod_aluno, idpk, nome_aluno from aluno natural join turma_disc where rg_aluno ilike'"+
                    reg+ "%'");
            rs =pst.executeQuery();
            
            while(rs.next()){

              RegistroAlunoModel a = new RegistroAlunoModel();
              
              AlunosModel b = new AlunosModel();
             
              
              b.setCod(rs.getInt("cod_aluno"));
                   b.setNome(rs.getString("nome_aluno"));
                   a.setAluno(b);
                   a.setNome(b);
                   
                   a.setCod(rs.getInt("idpk"));
                    listaa1.add(a);

            }
            
            
            
            } catch (SQLException ex) {
            Logger.getLogger(EscolarDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            return listaa1;
            
            
            
            
        }
        
        
        
        
        
        
    
        
            
            
            
            
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    

