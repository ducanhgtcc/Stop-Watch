import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    Date startTime, stopTime;
    long start, stop;

    public StopWatch() {
        this.startTime = new Date(System.currentTimeMillis());
        this.stopTime = new Date(System.currentTimeMillis());
        this.start = System.currentTimeMillis();
        this.stop = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = new Date(System.currentTimeMillis());
        this.start = System.currentTimeMillis();
        System.out.println("Thời gian bắt đầu là: " + this.startTime);
    }

    public void stop() {
        this.stopTime = new Date(System.currentTimeMillis());
        this.stop = System.currentTimeMillis();
        System.out.println("Thời gian dừng lại là: " + this.stopTime);
    }

    public void displayMiliseconds() {
        System.out.println("Thời gian trôi qua là: " + (this.stop - this.start) + "milisecond");
    }

    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 để bắt đầu, 2 để dừng lại");
        int number = scanner.nextInt();
        do {
            if (number == 1) {
                watch.start();
                number = scanner.nextInt();
            }
            if (number == 2) {
                watch.stop();
                watch.displayMiliseconds();
                break;
            }
        }
        while (number == 2);
    }
}
