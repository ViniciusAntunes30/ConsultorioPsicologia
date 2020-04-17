/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import negocio.Sessao;

/**
 *
 * @author Vinicius
 */
public class SessaoDAO implements ISessaoDAO{
    private Connection connection;
    
    
    public SessaoDAO(){
      this.connection = new ConFactory().getConnection();
    }
    
    @Override
    public void adiciona(Sessao sessao){
   
       String sql = "insert into sessao"+
        "(DATA, queixas_paciente, plano_tratamento, diagnostico_final, resumo_final, evolucao, pago)"+
        "values( ?, ?, ?, ?, ?, ?,now())";



        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            
            stmt.setDate(1,new Date(sessao.getDATA().getTimeInMillis()));
            stmt.setString(2,sessao.getQueixas_paciente());
            stmt.setString(3,sessao.getPlano_tratamento());
            
            stmt.setString(4,sessao.getDiagnostico_final());
            stmt.setString(5,sessao.getResumo_sessao());
            stmt.setInt(6,sessao.getEvolucao());
            stmt.setString(7,sessao.getPago());
            
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
 
 

    
}

    @Override
    public void altera(Sessao sessao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Sessao> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sessao getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
