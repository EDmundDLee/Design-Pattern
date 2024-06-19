package designpattern.abstractFactory.code;

/**
 * @author lijiaxu
 * @Description 女性工厂接口
 * @date 2024/6/19 14:10
 */
public class FemaleHumanFactory implements HumanFactory{

    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
