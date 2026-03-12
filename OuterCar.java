package outercar;

public class OuterCar {
    private InnerEngine engine;
    boolean isReady = true;

    public OuterCar() {
        engine = new InnerEngine();
    }

    public void drive() {
        System.out.println("OuterCar is preparing to drive...");
        engine.start();
        engine.shift();
        engine.stop();
    }

    class InnerEngine {
        public void start() {
            System.out.println("InnerEngine is starting.");
        }

        public void stop() {
            System.out.println("InnerEngine is stopping.");
        }

        public void shift() {
            System.out.println("InnerEngine is shifting gears.");
        }
    }
}
