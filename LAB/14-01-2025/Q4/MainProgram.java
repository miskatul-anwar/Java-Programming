import java.util.Random;

class ParallelMin implements Runnable {
  private int[] numbers;
  private int start;
  private int end;
  private int min;

  public ParallelMin(int[] numbers, int start, int end) {
    this.numbers = numbers;
    this.start = start;
    this.end = end;
    this.min = Integer.MAX_VALUE; // Initialize to the maximum value
  }

  public int getMin() {
    return min;
  }

  @Override
  public void run() {
    for (int i = start; i < end; i++) {
      if (numbers[i] < min) {
        min = numbers[i];
      }
    }
  }
}

public class MainProgram {
  public static void main(String[] args) {
    Random random = new Random();
    int[] numbers = new int[500];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(); // Generate random integers
    }

    // Create and start 5 threads
    ParallelMin[] tasks = new ParallelMin[5];
    Thread[] threads = new Thread[5];
    int segmentSize = numbers.length / 5;

    for (int i = 0; i < 5; i++) {
      int start = i * segmentSize;
      int end = (i == 4) ? numbers.length : start + segmentSize; // Handle the last segment
      tasks[i] = new ParallelMin(numbers, start, end);
      threads[i] = new Thread(tasks[i]);
      threads[i].start();
    }

    // Wait for all threads to finish
    try {
      for (int i = 0; i < 5; i++) {
        threads[i].join();
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // Find the minimum value among the results of each thread
    int globalMin = Integer.MAX_VALUE;
    for (int i = 0; i < 5; i++) {
      if (tasks[i].getMin() < globalMin) {
        globalMin = tasks[i].getMin();
      }
    }

    System.out.println("Minimum value: " + globalMin);
  }
}
