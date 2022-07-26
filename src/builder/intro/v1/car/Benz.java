package builder.intro.v1.car;

public class Benz extends CarModel {

    @Override
    protected void start() {
        System.out.println("Benz start");
    }

    @Override
    protected void stop() {
        System.out.println("Benz stop");
    }

    @Override
    protected void alarm() {
        System.out.println("Benz alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("Benz engine boom");
    }
}
