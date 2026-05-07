/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


/**
 *
 * @author u07449294150
 */

import bean.JavVenda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoJavVenda extends DaoAbstract {

    @Override
    public void insert(Object object) {
        JavVenda javVenda = (JavVenda) object;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_july_perez";
            user = "july_perez"; 
            password = "july_perez";
            
           Connection cnt;
           cnt = DriverManager.getConnection(url, user, password);
           
            String sql = "insert into jav_venda values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, javVenda.getJavIdCliente());
            pst.setInt(2, javVenda.getJavIdCliente());
            pst.setInt(3, javVenda.getJavIdVendedor());
            pst.setString(4,null); // jav_data_venda
            pst.setDouble(5, javVenda.getJavValorTotal()); 
            pst.setString(6, javVenda.getJavStatus());
            pst.setString(7, null); // jav_data_registro
            pst.setInt(8, javVenda.getJavIdProduto()); 
            pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoJavVenda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoJavVenda.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    @Override
    public void update(Object object) {
        JavVenda javVenda = (JavVenda) object;
    }

    @Override
    public void delete(Object object) {
        JavVenda javVenda = (JavVenda) object;
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
