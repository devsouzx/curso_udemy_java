package sections.section21;

import sections.section21.db.DB;
import sections.section21.db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction {
  public static void main(String[] args) {
    Connection connection = null;
    Statement statement = null;

    try {
      connection = DB.getConnection();
      connection.setAutoCommit(false);
      statement = connection.createStatement();

      int rows1 = statement.executeUpdate("UPDATE seller SET BaseSalary = 444444444444 WHERE DepartmentId = 1");
      //  int x = 1;
      //  if (x < 2) {
      //    throw new SQLException("Fake error");
      //  }
      int rows2 = statement.executeUpdate("UPDATE seller SET BaseSalary = 987654321 WHERE DepartmentId = 2");

      connection.commit();
      System.out.println(rows1);
      System.out.println(rows2);
    } catch (SQLException e) {
      try {
        connection.rollback();
        throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
      } catch (SQLException ex) {
        throw new DbException("Error trying to roll back! Caused by: " + e.getMessage());
      }
    }
  }
}
