package sections.section21;

import sections.section21.db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Insert {
  public static void main(String[] args) {
    Connection connection = null;
    PreparedStatement statement = null;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    try {
      connection = DB.getConnection();
      statement = connection.prepareStatement(
              "INSERT INTO seller "
                      + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                      + "VALUES "
                      + "(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

      statement.setString(1, "Joao");
      statement.setString(2, "joao@gamil.com");
      statement.setDate(3, new Date(sdf.parse("07/09/2007").getTime()));
      statement.setDouble(4, 1200);
      statement.setInt(5, 4);

      int rowsAffected = statement.executeUpdate();

      if (rowsAffected > 0) {
        ResultSet resultSet = statement.getGeneratedKeys();

        while (resultSet.next()) {
          int id = resultSet.getInt(1);
          System.out.println(id);
        }
      } else {
        System.out.println("nada");
      }
    } catch (SQLException | ParseException e) {
      throw new RuntimeException(e);
    } finally {
      DB.closeStatement(statement);
      DB.closeConnection();
    }
  }
}
