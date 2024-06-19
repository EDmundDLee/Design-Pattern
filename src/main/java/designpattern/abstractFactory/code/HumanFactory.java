package designpattern.abstractFactory.code;

/**
 * @author lijiaxu
 * @Description 人类工厂接口
 * @date 2024/6/19 14:10
 */
public interface HumanFactory {

    //制造一个黄色人种
    public Human createYellowHuman();
    //制造一个白色人种
    public Human createWhiteHuman();
    //制造一个黑色人种
    public Human createBlackHuman();
}
