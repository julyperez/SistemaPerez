/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.JavUsuarios;
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
public class DaoJavUsuario extends DaoAbstract{

    @Override
    public void insert(Object object) {
        JavUsuarios javUsuarios = (JavUsuarios) object;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_july_perez";
            user = "july_perez"; 
            password = "july_perez";
            
           Connection cnt;
           cnt = DriverManager.getConnection(url, user, password);
           
            String sql = "insert into jav_usuario values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, javUsuarios.getJavIdUsuarios());
            pst.setString(2, javUsuarios.getJavNome());
            pst.setString(3, javUsuarios.getJavApelido());
            pst.setString(4, javUsuarios.getJavCpf());
            pst.setString(5, null); // jav_dataNascimento
            pst.setString(6, javUsuarios.getJavSenha());
            pst.setString(7, javUsuarios.getJavAtivo());
            pst.setString(8, javUsuarios.getJavNivel()); 
            pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoJavUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoJavUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    @Override
    public void update(Object object) {
         JavUsuarios javUsuarios = (JavUsuarios) object;
    }

    @Override
    public void delete(Object object) {
         JavUsuarios javUsuarios = (JavUsuarios) object;
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
