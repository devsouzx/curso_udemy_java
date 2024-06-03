package sections.section19.exercise1_set;

import java.util.Date;
import java.util.Objects;

public class User {
  private String name;
  private Date login;

  public User(String name, Date login) {
    this.name = name;
    this.login = login;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getLogin() {
    return login;
  }

  public void setLogin(Date login) {
    this.login = login;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return Objects.equals(name, user.name);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(name);
  }
}
