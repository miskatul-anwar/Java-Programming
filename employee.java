class Inneremployee {
  private String name;
  private int Id;

  Inneremployee(String name, int Id) {
    this.name = name;
    this.Id = Id;
    System.out.println(this.Id + " Logged In");
  }
}

public class employee {
  public static void main(String[] args) {
    new Inneremployee("Miskatul Anwar", 34);
  }
}
