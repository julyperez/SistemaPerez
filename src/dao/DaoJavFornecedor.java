/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.JavFornecedor;
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
public class DaoJavFornecedor extends DaoAbstract{

    @Override
    public void insert(Object object) {
        JavFornecedor javFornecedor = (JavFornecedor) object;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_july_perez";
            user = "july_perez"; 
            password = "july_perez";
            
           Connection cnt;
           cnt = DriverManager.getConnection(url, user, password);
           
            String sql = "insert into jav_fornecedor values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, javFornecedor.getJavIdFornecedor());
            pst.setString(2, javFornecedor.getJavRazaoSocial());
            pst.setString(3, javFornecedor.getJavNomeFantasia());
            pst.setString(4, javFornecedor.getJavCnpj());
            pst.setString(5, javFornecedor.getJavEmail());
            pst.setString(6, javFornecedor.getJavTelefone());
            pst.setString(7, javFornecedor.getJavCep());
            pst.setString(8, javFornecedor.getJavEndereco());
            pst.setString(9, javFornecedor.getJavBairro());
            pst.setString(10, javFornecedor.getJavCidade());
            pst.setString(11, javFornecedor.getJavEstado());
            pst.setString(12, javFornecedor.getJavNumero());
            pst.setString(13, javFornecedor.getJavComplemento());
            pst.setString(15, null); //jav_data_cadastro
            pst.setString(14, javFornecedor.getJavAtivo());
            pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoJavFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoJavFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    @Override
    public void update(Object object) {
        JavFornecedor javFornecedor = (JavFornecedor) object;
    }

    @Override
    public void delete(Object object) {
        JavFornecedor javFornecedor = (JavFornecedor) object;
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
