package designpattern.abstractFactory.code;

/**
 * @author lijiaxu
 * @Description
 * @date 2024/6/19 14:09
 */
public class FemaleYellowHuman extends AbstractYellowHuman{
    @Override
    public void getSex() {
        System.out.println("黄色女性");
    }
}
