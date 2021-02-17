package mx.com.hittechs.threads.fork.join;

import static java.lang.Integer.SIZE;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import static java.util.concurrent.ForkJoinTask.invokeAll;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class RecursiveActionTest extends RecursiveAction {

    int[] array;
    int number;
    int threshold = 1_000;
    int start;
    int end;

    public RecursiveActionTest(int[] array, int number, int start, int end) {
        this.array = array;
        this.number = number;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if (end - start < threshold) {
            computeDirectly();
        } else {
            int middle = (end + start) / 2;
            RecursiveActionTest subTask1 = new RecursiveActionTest(array, number, start, middle);
            RecursiveActionTest subTask2 = new RecursiveActionTest(array, number, middle, end);
            invokeAll(subTask1, subTask2);
        }
    }

    protected void computeDirectly() {
        for (int i = start; i < end; i++) {
            array[i] = i * number;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[100_000];
        RecursiveActionTest mainTask = new RecursiveActionTest(array, 5, 0, array.length);
        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(mainTask);
    }
}
