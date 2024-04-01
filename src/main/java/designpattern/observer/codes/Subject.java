package designpattern.observer.codes;

/**
 * @author lijiaxu
 * @Description 主题接口，所有的主题必须实现此接口
 * @date 2024/2/23 14:56
 */
public interface Subject {

    /**
     * 注册一个观察着
     *
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 移除一个观察者
     *
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 通知所有的观察着
     */
    public void notifyObservers();
}
