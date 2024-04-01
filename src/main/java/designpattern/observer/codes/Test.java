package designpattern.observer.codes;

/**
 * @author lijiaxu
 * @Description
 * @date 2024/4/1 14:50
 */
public class Test {

    public static void main(String[] args) {
        ObjectFor3D objectFor3D = new ObjectFor3D();
        Observer1 observer1 = new Observer1(objectFor3D);
        Observer2 observer2 = new Observer2(objectFor3D);

        objectFor3D.setMsg("昨天号码为：2023");
        objectFor3D.setMsg("今天号码为：2024");
    }
}
