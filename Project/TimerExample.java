package Project;

import java.util.Timer;
import java.util.TimerTask;

public class TimerExample {
    public static void main(String[] args) {
        Timer timer = new Timer(); // Creating a Timer object from the timer class

        TimerTask task1 = new TimerTask() {
            public void run() {
                System.out.println("Timeover");
            }
        };

        // Scheduling tasks to run after specified delays
        timer.schedule(task1, 100000); // Using the schedule method of the timer class
    }
}