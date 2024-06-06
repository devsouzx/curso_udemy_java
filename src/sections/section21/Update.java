package sections.section21;

import sections.section21.db.DB;

import java.sql.*;

public class Update {
  public static void main(String[] args) {
    Connection connection = null;
    PreparedStatement statement = null;

    try {
      connection = DB.getConnection();
      statement = connection.prepareStatement(
              "UPDATE seller "
                      + "SET BaseSalary = BaseSalary + ?"
                      + "WHERE "
                      + "(DepartmentId = ?)");

      statement.setDouble(1, 10000);
      statement.setInt(2, 1);

      statement.executeUpdate();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}