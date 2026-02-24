package Executor_Framework;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Shared Resource
class TaskCounter {
    private int count = 0;

    // synchronized to avoid race condition
    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() +
                " processed task. Total Completed: " + count);
    }

    public int getCount() {
        return count;
    }
}

// Task Class
class Task implements Runnable {

    private TaskCounter counter;
    private int taskId;

    public Task(TaskCounter counter, int taskId) {
        this.counter = counter;
        this.taskId = taskId;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() +
                    " started Task ID: " + taskId);

            Thread.sleep(1000); // Simulating work

            counter.increment();

            System.out.println(Thread.currentThread().getName() +
                    " completed Task ID: " + taskId);

        } catch (InterruptedException e) {
            System.out.println("Task Interrupted");
        }
    }
}

// Main Class
public class TaskManager {

    public static void main(String[] args) {

        TaskCounter counter = new TaskCounter();

        // Fixed Thread Pool (3 threads)
        ExecutorService executor = Executors.newFixedThreadPool(3);

        System.out.println("Submitting Tasks...\n");

        for (int i = 1; i <= 10; i++) {
            executor.execute(new Task(counter, i));
        }

        executor.shutdown(); // Stop accepting new tasks

        try {
            executor.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nAll Tasks Finished.");
        System.out.println("Total Tasks Processed: " + counter.getCount());
    }
}


