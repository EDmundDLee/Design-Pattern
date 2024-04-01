package designpattern.observer.codes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lijiaxu
 * @Description
 * @date 2024/2/23 14:58
 */
public class ObjectFor3D implements Subject{

    private List<Observer> observers = new ArrayList<Observer>();
    /**
     * 3D彩票的号码
     */
    private String msg;


    @Override
    public void registerObserver(Observer observer) {
         observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0)
        {
            observers.remove(index);
        }

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers)
        {
            observer.update(msg);
        }

    }

    /**
     * 主题更新消息
     *
     * @param msg
     */
    public void setMsg(String msg)
    {
        this.msg = msg;

        notifyObservers();
    }
}
