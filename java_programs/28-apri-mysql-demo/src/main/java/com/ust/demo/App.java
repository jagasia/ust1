package com.ust.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM BRANCH");
        while(rs.next())
        {
        	System.out.printf("%-8s\n%-25s%-20s",rs.getString(1),rs.getString(2),rs.getString(3));
        }
        con.close();
    }
}
