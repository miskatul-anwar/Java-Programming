import java.util.ArrayList;
import java.util.List;

class Demo {
  public void show() {
    List<String> list = new ArrayList<>();
    System.out.println(list.get(0));
  }
}

public class GfgArray {
  public static void main(String[] args) {
    Demo demo = new Demo();
    demo.show();
  }
}
