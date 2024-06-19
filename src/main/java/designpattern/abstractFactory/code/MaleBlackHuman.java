package designpattern.abstractFactory.code;

/**
 * @author lijiaxu
 * @Description
 * @date 2024/6/19 14:07
 */
public class MaleBlackHuman extends AbstractBlackHuman{

    @Override
    public void getSex() {
        System.out.println("黑色男性");
    }
}
