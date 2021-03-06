package postgreSqlDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class PostgreSqlLaunch {
	public static void main(String[] args) {
	      Connection c = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/company",
	            "postgres", "admin");
	      } catch (Exception e) {
	        System.out.println(e);
	      }
	      System.out.println("Opened database successfully");
	   try{
	Statement stmt;
	stmt = c.createStatement();
    String sql = "CREATE TABLE emptab11 " +
                 "(ID INT PRIMARY KEY     NOT NULL," +
                 " NAME           TEXT    NOT NULL, " +
                 " AGE            INT     NOT NULL, " +
                 " ADDRESS        CHAR(50), " +
                 " SALARY         REAL)";
    stmt.executeUpdate(sql);
    stmt.close();
    c.close();
  } catch ( Exception e ) {
    System.out.println("Problem in creating databases.......");
  }
  System.out.println("Table created successfully");
}
	

}
