public class Restaurant implements Runnable {
    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodNumber = 1;

    @Override
    public void run() {
        while (true) {
            makeFood();
            try {
                Thread.sleep(2500);
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }
    public static int getFoodNumber() {
        return foodNumber;
    }
    public void makeFood() {
        synchronized(Restaurant.lock) {
            if (this.waitingForPickup) {
                try {
                    System.out.println("Restaurant: Waiting For The Waiter To Deliver The Food");
                    Restaurant.lock.wait();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            waitingForPickup = true;
            System.out.println("Restaurant: Making Food Number " + foodNumber++);
            Restaurant.lock.notifyAll();
            System.out.println("Restaurant: Telling The Waiter To Get The Food\n");
        }
    }
    public static Object getlock() {
        return lock;
    }
}