package br.com.samuelningumpedroso.introducao_testes_automatizados;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.Test;

public class UserServiceTest {

  private UserService userService = new UserService();

  @Test
  public void createUser_ReturnsUsers() {
    User user = new User("Ningum", "123");

    List<User> users = userService.create(user);

    assertEquals(1, users.size());
    assertEquals(user, users.get(0));
  }

  @Test
  public void createUser_ThrowsException() {
    User user = new User("Ningum", "123");
    userService.create(user);

    assertThrows(RuntimeException.class, () -> userService.create(user));
  }
}
