import java.util.HashSet;
import java.util.Set;

/**
 * Jaccard_Simmilarity
 */
public class Jaccard_Simmilarity {
	public static void main(String args[]){
      String s1 = "Data is the new oil of digital economy";
      String s2 = "Data is a new oil";
      String temp = s1+" "+s2;
      Set<String>crdiUni = new HashSet<>();
      for (String it :temp.split(" ")) {
          crdiUni.add(it);
      }
      Set<String> set1=new HashSet<>();
      for (String it : s1.split(" ")) {
          set1.add(it);
      }
      Set<String> set2=new HashSet<>();
      for (String it : s2.split(" ")) {
          set2.add(it);
      }
      int cnt=0;
      for (String it : set1) {
          if (set2.contains(it)) {
              cnt++;
          }
      }
          int n = crdiUni.size();
      System.out.println((double)cnt/n);
      return;
    }
}
