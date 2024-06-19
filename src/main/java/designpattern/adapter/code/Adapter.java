package designpattern.adapter.code;

/**
 * @author lijiaxu
 * @Description 两项插头适配器
 * @date 2024/6/19 11:45
 */
public class Adapter implements TriplePin{

    private DualPin dualPin;
    public Adapter(DualPin dualPin) {

        this.dualPin = dualPin;
    }

    @Override
    public void electrify(int l, int n, int e) {
        dualPin.electrify(l,n);
    }
}
