class ParallelSum implements Runnable {
  private int sum = 0;
  private int start;
  private int end;
  private int step;

  ParallelSum(int start, int end, int step) {
    this.start = start;
    this.end = end;
    this.step = step;
  }

  public int getSum() {
    return sum;
  }

  @Override
  public void run() {
    for (int i = start; i < end; i += step) {
      sum += i;
    }
  }
}

public class Answer01Thread {

  public static void main(String[] args) {
    int start = 0, end = 10000, step = 1;
    ParallelSum[] tasks = new ParallelSum[5];
    Thread[] threads = new Thread[5];
    int segmentSize = end / 5;

    for (int i = 0; i < 5; i++) {
      end = start + segmentSize;
      tasks[i] = new ParallelSum(start, end, step);
      threads[i] = new Thread(tasks[i]);
      threads[i].start();
      start = end;
    }

    try {
      for (int i = 0; i < 5; i++) {
        threads[i].join();
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    int sum = 0;

    for (int i = 0; i < 5; i++) {
      sum += tasks[i].getSum();
    }

    System.out.println("Sum of 1 to 10000: " + sum);
  }
}
