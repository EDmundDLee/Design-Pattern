package designpattern.abstractFactory.code;

/**
 * @author lijiaxu
 * @Description 黑色人种抽象类
 * @date 2024/6/19 14:00
 */
public abstract class AbstractBlackHuman implements Human{

    //黑色人种的皮肤颜色是白
    public void getColor() {
        System.out.println("黑色");
    }

    //黑色人种讲话
    public void talk() {
        System.out.println("黑色人种讲话");
    }
}
