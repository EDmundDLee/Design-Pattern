package designpattern.observer.codes;

/**
 * @author lijiaxu
 * @Description 使用者1
 * @date 2024/2/23 15:00
 */
public class Observer1 implements Observer{

    private Subject subject;

    public Observer1(Subject subject)
    {
        this.subject = subject;
        subject.registerObserver(this);
    }


    @Override
    public void update(String msg) {
        System.out.println("observer1 得到 3D 号码  -->" + msg + ", 我要记下来。");
    }
}
