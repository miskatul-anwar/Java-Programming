package cse.utils;

import java.util.*;

public class spec {
  public static void print(Object obj) {
    System.out.print(obj);
  }

  public static void println(Object obj) {
    System.out.println(obj);
  }

  public static void nl() {
    System.out.println();
  }

  public static int getint() {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    sc.close();
    return x;
  }

  public static void swap(Object a, Object b) {
    Object t = a;
    a = b;
    b = t;
  }
}
