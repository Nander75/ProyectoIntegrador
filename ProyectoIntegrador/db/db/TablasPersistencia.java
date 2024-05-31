package com.dam.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dam.model.DatosUsuarioPI;

public class TablasPersistencia {
	private AccesoBBDD acceso;
	
	public TablasPersistencia() {
		this.acceso = new AccesoBBDD();
	}
	
	public List<Object[]> getTop10() {
        
		List<Object[]> top10 = new ArrayList<>();
        
        Connection con = null;
	    PreparedStatement stmt = null;
	    ResultSet rslt = null;

        try {
            
        	con = acceso.getConexion();
            
            String query = "SELECT u.NOMBRE, q.PUNTOS FROM USUARIO u " +
                           "JOIN RANKING r ON u.ID_USUARIO = r.ID_USUARIO " +
                           "JOIN QUIZ q ON r.ID_QUIZ = q.ID_QUIZ " +
                           "ORDER BY q.PUNTOS DESC FETCH FIRST 10 ROWS ONLY";
            
            stmt = con.prepareStatement(query);
            rslt = stmt.executeQuery();

            while (rslt.next()) {
                String nombre = rslt.getString("NOMBRE");
                int puntos = rslt.getInt("PUNTOS");
                top10.add(new Object[]{nombre, puntos});
            }

            rslt.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return top10;
    }
	
	public int consultarPassword(DatosUsuarioPI du) {
	    // res = 0 --> No se encuentra el usuario
	    // res = -1 --> La contraseña no es correcta
	    // res = 1 --> Todo ok

	    int res = 0;

	    String query = "SELECT " + Tablas.CLM_USUARIOS_CONTRASENIA + " FROM " + Tablas.NOM_TABLA_USUARIOS 
	                    + " WHERE " + Tablas.CLM_USUARIOS_NOMBRE + " = ?";

	    Connection con = null;
	    PreparedStatement stmt = null;
	    ResultSet rslt = null;

	    try {

	        con = acceso.getConexion();

	        stmt = con.prepareStatement(query);
	        stmt.setString(1, du.getNombre());

	        rslt = stmt.executeQuery();

	        String password;
	        if (rslt.next()) {

	            password = rslt.getString(Tablas.CLM_USUARIOS_CONTRASENIA);

	            if (password.equals(du.getContrasenia())) {
	                res = 1;
	            } else {
	                res = -1;
	            }
	        }

	    } catch (ClassNotFoundException | SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {

	            if (rslt != null) {
	                rslt.close();
	            }
	            if (stmt != null) {
	                stmt.close();
	            }
	            if (con != null) {
	                con.close();

	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    } 

	    return res;
	}
	
	public int registrarUsuario(DatosUsuarioPI du) {
	    // res = 1 --> registrar usuario correctamente
	    // res = 0 --> si el usuario ya existe
	    // res = -1 --> si la contraseña ya existe

	    int res = 0;

	    String queryU = "SELECT * FROM " + Tablas.NOM_TABLA_USUARIOS + " WHERE " + Tablas.CLM_USUARIOS_NOMBRE + " = ?";
	    String queryP = "SELECT * FROM " + Tablas.NOM_TABLA_USUARIOS + " WHERE " + Tablas.CLM_USUARIOS_CONTRASENIA + " = ?";
	    
	    String insert = "INSERT INTO " + Tablas.NOM_TABLA_USUARIOS + " VALUES (?, ?)";

	    Connection con = null;
	    PreparedStatement stmt = null;
	    PreparedStatement stmtU = null;
	    ResultSet rsltU = null;
	    PreparedStatement stmtP = null;
	    ResultSet rsltP = null;

	    try {

	        con = acceso.getConexion();

	        stmtU = con.prepareStatement(queryU);
	        stmtU.setString(1, du.getNombre());
	        rsltU = stmtU.executeQuery();
	        if (rsltU.next()) {
	            res = 0;
	        } else {
	            stmtP = con.prepareStatement(queryP);
	            stmtP.setString(1, du.getContrasenia());
	            rsltP = stmtP.executeQuery();
	            if (rsltP.next()) {
	                res = -1;
	            } else {
	                stmt = con.prepareStatement(insert);
	                stmt.setString(1, du.getNombre());
	                stmt.setString(2, du.getContrasenia());
	                res = stmt.executeUpdate();
	            }
	        }

	    } catch (ClassNotFoundException | SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (stmt != null) {
	                stmt.close();
	            }
	            if (rsltP != null) {
	                rsltP.close();
	            }
	            if (stmtP != null) {
	                stmtP.close();
	            }
	            if (rsltU != null) {
	                rsltU.close();
	            }
	            if (stmtU != null) {
	                stmtU.close();
	            }
	            if (con != null) {
	                con.close();
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    return res;
	}

	

	
}
