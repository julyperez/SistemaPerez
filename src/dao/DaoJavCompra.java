/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.JavCompra;
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
public class DaoJavCompra extends DaoAbstract{

    @Override
    public void insert(Object object) {
        JavCompra javCompra = (JavCompra) object;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_july_perez";
            user = "july_perez"; 
            password = "july_perez";
            
           Connection cnt;
           cnt = DriverManager.getConnection(url, user, password);
           
            String sql = "insert into jav_compra values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, javCompra.getJavIdCompra());
            pst.setInt(2, javCompra.getJavIdFornecedor());
            pst.setInt(3, javCompra.getJavIdUsuario());
            pst.setString(4, null); //jav_data_compra
            pst.setDouble(5, javCompra.getJavValorTotal());
            pst.setString(7, javCompra.getJavStatus());
            pst.setString(8, null); //jav_data_registroS
            pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoJavCompra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoJavCompra.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }

    @Override
    public void update(Object object) {
        JavCompra javCompra = (JavCompra) object;
    }

    @Override
    public void delete(Object object) {
        JavCompra javCompra = (JavCompra) object;
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
