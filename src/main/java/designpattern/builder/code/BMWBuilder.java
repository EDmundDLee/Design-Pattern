package designpattern.builder.code;

import java.util.ArrayList;

/**
 * @author lijiaxu
 * @Description
 * @date 2024/6/19 14:58
 */
public class BMWBuilder extends CarBuilder{

    private BMWModel bmwModel;
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }
}
