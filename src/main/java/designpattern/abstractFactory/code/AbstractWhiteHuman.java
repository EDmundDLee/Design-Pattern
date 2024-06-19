package designpattern.abstractFactory.code;

/**
 * @author lijiaxu
 * @Description
 * @date 2024/6/19 13:56
 */
public abstract class AbstractWhiteHuman implements Human {

    //白色人种的皮肤颜色是白
    public void getColor() {
        System.out.println("白色");
    }

    //白色人种讲话
    public void talk() {
        System.out.println("白色人种讲话");
    }


}
