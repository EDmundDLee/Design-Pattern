package designpattern.abstractFactory.code;

/**
 * @author lijiaxu
 * @Description
 * @date 2024/6/19 14:12
 */
public class MaleHumanFactory implements HumanFactory{
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
