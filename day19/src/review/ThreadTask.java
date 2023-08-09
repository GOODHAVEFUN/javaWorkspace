package review;

class ThreadTask implements Runnable {
    public void run() {
        String threadName = Thread.currentThread().getName();
        if (threadName.equals("A")) {
            printA();
        } else if (threadName.equals("B")) {
            printB();
        } else if (threadName.equals("C")) {
            printC();
        }
    }

    public void printA() {
        System.out.println("Thread A");
    }

    public void printB() {
        System.out.println("Thread B");
    }

    public void printC() {
        System.out.println("Thread C");
    }
}
