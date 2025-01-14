class Rectangle {
  private Integer width;
  private Integer height;

  Rectangle(Integer width, Integer height) {
    this.height = height;
    this.width = width;
  }

  Integer getArea() {
    return this.height * this.width;
  }
}

public class Ans2 {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(12, 12);
    System.out.println(rectangle.getArea());
  }
}
