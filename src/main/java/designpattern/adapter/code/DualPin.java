package designpattern.adapter.code;

/**
 * @author lijiaxu
 * @Description 两项插头
 * @date 2024/6/19 11:44
 */
public interface DualPin {

    //参数分别为火线live，零线null
    public void electrify(int l, int n);
}
