/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.JavCompraProduto;
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
public class DaoJavCompraProduto extends DaoAbstract{

    @Override
    public void insert(Object object) {
        JavCompraProduto javCompraProduto = (JavCompraProduto) object;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_july_perez";
            user = "july_perez"; 
            password = "july_perez";
            
           Connection cnt;
           cnt = DriverManager.getConnection(url, user, password);
           
            String sql = "insert into jav_compra_produto values(?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, javCompraProduto.getJavIdCompraProduto());
            pst.setInt(2, javCompraProduto.getJavIdCompra());
            pst.setInt(3, javCompraProduto.getJavIdProduto());
            pst.setInt(4, javCompraProduto.getJavQuantidade());
            pst.setDouble(5, javCompraProduto.getJavPreco());
            pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoJavCompraProduto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoJavCompraProduto.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    @Override
    public void update(Object object) {
        JavCompraProduto javCompraProduto = (JavCompraProduto) object;
    }

    @Override
    public void delete(Object object) {
       JavCompraProduto javCompraProduto = (JavCompraProduto) object; 
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
