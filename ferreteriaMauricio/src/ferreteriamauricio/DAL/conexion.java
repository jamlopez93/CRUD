/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferreteriamauricio.DAL;
import java.sql.*;
/**
 *
 * @author USER
 */
public class conexion {
    String strConexionDB = "jdbc:mysql://localhost:3306/?user=root";
    Connection conn = null;
    public conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(Propiedades.URL, Propiedades.USERNAME, Propiedades.PASSWORD);
            System.out.println("Conexion establecida");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
public int ejecutarSentenciaSQL(String strSentenciaSQL){
    try {
        PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
        pstm.execute();
        return 1;
    } catch (SQLException e) {
        System.out.println(e);
        return 0;       
    }
}
public ResultSet consultarRegistros(String strSentenciaSQL){
    try {
        
        PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
        ResultSet respuesta = pstm.executeQuery();
        return respuesta;
    } catch (Exception e) {
        System.out.println(e);
        return null;
    }
}
    
}
