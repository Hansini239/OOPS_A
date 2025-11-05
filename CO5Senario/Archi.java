package CO5Senario;


class User {
 private String name;
 public User(String name) { this.name = name; }
 public String getName() { return name; }
}


interface UserService {
 void register(User user);
}
class UserServiceImpl implements UserService {
 public void register(User user) {
     System.out.println("User Registered: " + user.getName());
 }
}


class UserController {
 private UserService service;
 public UserController(UserService service) {
     this.service = service;
 }
 public void addUser(String name) {
     User user = new User(name);
     service.register(user);
 }
}


public class Archi{
 public static void main(String[] args) {
     UserService service = new UserServiceImpl();
     UserController controller = new UserController(service);
     controller.addUser("Hani");
 }
}
