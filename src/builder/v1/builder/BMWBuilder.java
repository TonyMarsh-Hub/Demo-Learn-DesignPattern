package builder.v1.builder;

import builder.v1.car.BMW;
import builder.v1.car.CarModel;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {
    private BMW bmw = new BMW();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return bmw;
    }
}
