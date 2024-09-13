import cse.utils.*;

class DaemonThreadExample extends Thread {
  public void run() {
    spec.print("HI there");
  }
}

public class Main {
  public static void main(String[] args) {
    DaemonThreadExample daemonThread = new DaemonThreadExample();
    daemonThread.setDaemon(true); // Set the thread as a daemon thread
    daemonThread.start();
  }
}
