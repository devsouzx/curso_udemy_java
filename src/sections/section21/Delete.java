package sections.section21;

import sections.section21.db.DB;
import sections.section21.db.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
  public static void main(String[] args) {
    Connection connection = null;
    PreparedStatement statement = null;

    try {
      connection = DB.getConnection();
      statement = connection.prepareStatement(
              "DELETE FROM department "
                      + "WHERE "
                      + "(Id = ?)");

      statement.setInt(1, 2);
      statement.executeUpdate();
    } catch (SQLException e) {
      throw new DbIntegrityException(e.getMessage());
    }
  }
}