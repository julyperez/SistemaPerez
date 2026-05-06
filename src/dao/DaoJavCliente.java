/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.JavCliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author u07449294150
 */
public class DaoJavCliente extends DaoAbstract{
    @Override
    public void insert(Object object) {
         JavCliente javCliente = (JavCliente) object;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_july_perez";
            user = "july_perez"; 
            password = "july_perez";
            
           Connection cnt;
           cnt = DriverManager.getConnection(url, user, password);
           
            String sql = "insert into jav_cliente values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, javCliente.getJavIdCliente());
            pst.setString(2, javCliente.getJavNome());
            pst.setString(3, javCliente.getJavCpf());
            pst.setString(4, javCliente.getJavEmail());
            pst.setString(5, javCliente.getJavTelefone());
            pst.setString(6, null); //jav_datanascimento
            pst.setString(7, javCliente.getJavCep());
            pst.setString(8, javCliente.getJavEndereco());
            pst.setString(9, javCliente.getJavBairro());
            pst.setString(10, javCliente.getJavCidade());
            pst.setString(11, javCliente.getJavEstado());
            pst.setString(12, javCliente.getJavNumero());
            pst.setString(13, javCliente.getJavComplemento());
            pst.setString(14, null); //jav_datacadastro
            pst.setString(15, javCliente.getJavAtivo());
            pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoJavCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoJavCliente.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    @Override
    public void update(Object object) {
         JavCliente javCliente = (JavCliente) object;
    }

    @Override
    public void delete(Object object) {
         JavCliente javCliente = (JavCliente) object;
    }

    @Override
    public Object list(int id) {
        return null;
    }

    @Override
    public Object listAll() {
        return null;
    }
    
}
