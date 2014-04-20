package edu.ncsu.util;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.ncsu.beans.User;

public class TestDAO implements Serializable {
	
   private static final long serialVersionUID = 1L;
	
   public String getName(){
      ResultSet rs = null;
      PreparedStatement pst = null;
      Connection con = getConnection();
      String stm = "SELECT * FROM doctex.users where user_id = 'awang4'";
      User user = new User();
      try {   
         pst = con.prepareStatement(stm);
         pst.execute();
         rs = pst.getResultSet();

         while(rs.next()){
            user.setUser_id(rs.getString(1));			
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }
      
      return user.getUser_id();
   }

   public Connection getConnection(){
      Connection con = null;

      String url = "jdbc:mysql://localhost:3306/doctex";
      String user = "root";
      String password = "root";
      try {
         con = DriverManager.getConnection(url, user, password);
         System.out.println("Connection completed.");
      } catch (SQLException ex) {
         System.out.println(ex.getMessage());
      }
      finally{
      }
      return con;
   }
}