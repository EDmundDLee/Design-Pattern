package designpattern.builder.code;

/**
 * @author lijiaxu
 * @Description
 * @date 2024/6/19 14:55
 */
public class BenzModel extends CarModel{
    @Override
    protected void start() {
        System.out.println("奔驰车启动..");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车停止..");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车的喇叭声音..");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车的引擎声..");
    }
}
