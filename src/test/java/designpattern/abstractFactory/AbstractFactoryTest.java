package designpattern.abstractFactory;

import designpattern.abstractFactory.code.FemaleHumanFactory;
import designpattern.abstractFactory.code.Human;
import designpattern.abstractFactory.code.MaleHumanFactory;
import org.junit.jupiter.api.Test;

/**
 * @author lijiaxu
 * @Description
 * @date 2024/6/19 14:14
 */
public class AbstractFactoryTest {

    @Test
    void nvWa() {
        MaleHumanFactory maleHumanFactory = new MaleHumanFactory();
        Human blackHuman = maleHumanFactory.createBlackHuman();
        blackHuman.getColor();
        blackHuman.talk();
        blackHuman.getSex();

        FemaleHumanFactory femaleHumanFactory = new FemaleHumanFactory();

        Human yellowHuman = femaleHumanFactory.createYellowHuman();

        yellowHuman.getSex();
        yellowHuman.talk();
        yellowHuman.getColor();
    }
}
