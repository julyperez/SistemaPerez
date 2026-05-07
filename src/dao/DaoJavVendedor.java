/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.JavVendedor;
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
public class DaoJavVendedor extends DaoAbstract{

    @Override
    public void insert(Object object) {
           JavVendedor javVendedor = (JavVendedor) object;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_july_perez";
            user = "july_perez"; 
            password = "july_perez";
            
           Connection cnt;
           cnt = DriverManager.getConnection(url, user, password);
           
            String sql = "insert into jav_vendedor values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
              pst.setInt(1, javVendedor.getJavIdVendedor());
            pst.setString(2, javVendedor.getJavNome());
            pst.setString(3, javVendedor.getJavCpf());
            pst.setString(4, javVendedor.getJavEmail());
            pst.setString(5, javVendedor.getJavTelefone());
            pst.setString(6, null); //jav_datanascimento
            pst.setString(7, javVendedor.getJavCep());
            pst.setString(8, javVendedor.getJavEndereco());
            pst.setString(9, javVendedor.getJavBairro());
            pst.setString(10, javVendedor.getJavCidade());
            pst.setString(11, javVendedor.getJavNumero());
            pst.setString(12, javVendedor.getJavComplemento());
            pst.setString(13, null); //jav_data_admissao
            pst.setString(14, javVendedor.getJavAtivo());
            pst.setString(15, javVendedor.getJavEstado());
            pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoJavVendedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoJavVendedor.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    @Override
    public void update(Object object) {
        JavVendedor javVendedor = (JavVendedor) object;
    }

    @Override
    public void delete(Object object) {
        JavVendedor javVendedor = (JavVendedor) object;
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
