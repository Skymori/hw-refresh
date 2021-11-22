package hw12.task1.threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class Water {
    private final CyclicBarrier cyclicBarrier;
    private final Semaphore oxygenSenaphore;
    private final Semaphore hydrogenSemaphore;

    public Water() {
        cyclicBarrier = new CyclicBarrier(3);
        oxygenSenaphore = new Semaphore(1);
        hydrogenSemaphore = new Semaphore(2);
    }
    public void oxygen(Runnable releaseOxygen) throws InterruptedException{
        oxygenSenaphore.acquire();
        try {
            cyclicBarrier.await();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        releaseOxygen.run();
        oxygenSenaphore.release();
    }
    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        hydrogenSemaphore.acquire();
        try {
            cyclicBarrier.await();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        releaseHydrogen.run();
        hydrogenSemaphore.release();
    }

}
