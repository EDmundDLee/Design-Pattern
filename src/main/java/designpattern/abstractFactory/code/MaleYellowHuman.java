package designpattern.abstractFactory.code;

/**
 * @author lijiaxu
 * @Description
 * @date 2024/6/19 14:06
 */
public class MaleYellowHuman extends AbstractYellowHuman{
    @Override
    public void getSex() {
        System.out.println("黄色男性");
    }
}
