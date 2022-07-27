package builder.v1.builder;

import builder.v1.car.Benz;
import builder.v1.car.CarModel;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {

    private Benz benz = new Benz();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return benz;
    }
}
