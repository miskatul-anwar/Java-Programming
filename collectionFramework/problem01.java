import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Demo {
public void show()
    {
        List <String> list = new ArrayList<>();
        list.add("banana");
        list.add("apple");
        Collections.sort(list);
        Iterator itr = list.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}

public class problem01 {
    public static void main(String[] args)
        {
            Demo demo = new Demo();
            demo.show();
        }
}
