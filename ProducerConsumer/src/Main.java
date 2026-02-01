public class Main {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        Thread producerThread = new Thread(() -> pc.produce());
        Thread consumerThread = new Thread(() -> pc.consume());

        producerThread.start();
        consumerThread.start();

        try {
            consumerThread.join();
            producerThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
