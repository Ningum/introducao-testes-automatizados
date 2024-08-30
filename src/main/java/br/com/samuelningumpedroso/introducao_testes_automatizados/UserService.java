package br.com.samuelningumpedroso.introducao_testes_automatizados;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  List<User> users = new ArrayList<>();

  public List<User> create(User user) {
    if (users.contains(user)) {
      throw new RuntimeException();
    }

    users.add(user);
    return users;
  }
}
