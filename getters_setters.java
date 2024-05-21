import java.util.Random;

import cse.utils.*;

class Demo {
  public String name;
  protected String email;
  private String password;

  // getters & setters
  public String getPassword() {
    Random rand = new Random();
    setPassword(Integer.toString(rand.nextInt(1000)));
    return this.password;
  }

  private void setPassword(String pass) {
    this.password = pass;
  }
}

public class getters_setters {
  public static void main(String[] args) {
    Demo d = new Demo();
    d.name = "CSE";
    d.email = "cse@cs.rit.edu";
    // Now, print out the password!
    spec.print(d.getPassword());
  }
}
