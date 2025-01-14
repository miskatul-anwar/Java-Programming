class Vehicle {
  private String make;
  private String model;
  private Integer year;

  Vehicle(String make, String model, String year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  public void displayDetails() {
    System.out.println("Vehicle Details:");
    System.out.println("Make: " + make);
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
  }
}

class Car extends Vehicle {
  private Integer size;

  Car(String make, String model, String year, String size) {
    super(make, model, year);
    this.size = size;
  }

  @Override
  public void displayDetails() {
    super.displayDetails();
    System.out.println("Trunk Size: " + size + " cubic feet");
  }
}

public class Ans21 {

  public static void main(String[] args) {

  }
}
