package designpattern.adapter.code;

/**
 * @author lijiaxu
 * @Description 类适配器
 * @date 2024/6/19 13:21
 */
public class ClassAdapter extends Tv implements TriplePin {

    @Override
    public void electrify(int l, int n, int e) {
        System.out.println("火线接通："+l);
        System.out.println("零线接通："+n);
    }
}
