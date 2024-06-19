package designpattern.adapter.code;

/**
 * @author lijiaxu
 * @Description 三项插头
 * @date 2024/6/19 11:42
 */
public interface TriplePin {

    //参数分别为火线live，零线null，地线earth
    public void electrify(int l, int n, int e);
}
