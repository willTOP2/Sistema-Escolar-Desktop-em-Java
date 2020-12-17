
package Controller;

import Model.AlunosModel;
import Model.Conexao_bd;
import Views.Alunos;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Willian
 */
public class ControlAluno extends AlunoDao {

    AlunosModel a = new AlunosModel();
    

        public void AlunoControl(String nome, String sobrenome, String rg, String data){

         // AlunosModel a = new AlunosModel(nome, sobrenome, rg,data);


           if(nome.length()>0&&sobrenome.length()>0&&rg.length()>0&&data.length()>0){
               
               InserirAluno(a);

           }else{
                    JOptionPane.showMessageDialog(null, "insira os campos", "aviso", JOptionPane.ERROR_MESSAGE);
            }


        }
        
    
        }