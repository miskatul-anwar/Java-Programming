import java.util.Random;
import java.util.Scanner;

class bankAccount {
  public String name;
  public String ID;
  private String password;

  public String getPassword() {
    Random foo = new Random();
    setPassword(Integer.toString(rand.nextInt(1000)));
    return this.password;
  }

  public String getName() {
    Scanner foo = new Scanner();
    System.out.print("Enter you name: ");
    foo.next();
    setName(foo);
    return name;
  }

  private setPassword(String password){
    this.password = password;
  }

  private setName(String name){
    this.name = name;
  }

}
