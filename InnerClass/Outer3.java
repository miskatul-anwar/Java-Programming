public class Outer3 {
  private int value = 0;

  public void someMethod() {
    Thread t = new Thread(new Runnable() {
      public void run() {
        for (int i = 0; i < 10; i++) {
          System.out.println("Thread " + Thread.currentThread().getName() + ": Value: " + Outer.this.value);
        }
      }
    });
    t.start();
  }
}
