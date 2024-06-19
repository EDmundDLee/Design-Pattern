package designpattern.abstractFactory.code;

/**
 * @author lijiaxu
 * @Description 工厂模式的接口
 * @date 2024/6/19 13:54
 */
public interface Human {
    //每个人对应的肤色
    public void getColor();

    //人类都会说话
    public void talk();

    //每个人都有性别
    public void getSex();
}
