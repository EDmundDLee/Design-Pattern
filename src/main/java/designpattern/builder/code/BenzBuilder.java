package designpattern.builder.code;

import java.util.ArrayList;

/**
 * @author lijiaxu
 * @Description
 * @date 2024/6/19 14:57
 */
public class BenzBuilder extends CarBuilder{

    private BenzModel benz = new BenzModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
