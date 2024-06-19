package designpattern.adapter.code;

/**
 * @author lijiaxu
 * @Description
 * @date 2024/6/19 11:46
 */
public class Tv implements DualPin{

    @Override
    public void electrify(int l, int n) {
        System.out.println("火线接通了："+l);
        System.out.println("零线接通了："+l);
    }
}
