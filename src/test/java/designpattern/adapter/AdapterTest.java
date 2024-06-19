package designpattern.adapter;

import designpattern.adapter.code.Adapter;
import designpattern.adapter.code.ClassAdapter;
import designpattern.adapter.code.Tv;
import org.junit.jupiter.api.Test;

/**
 * @author lijiaxu
 * @Description
 * @date 2024/6/19 11:50
 */
public class AdapterTest {


    @Test
    void adapterTest() {
        Tv tv = new Tv();
        Adapter adapter = new Adapter(tv);
        adapter.electrify(1,2,3);
    }

    @Test
    void classAdapterTest(){
        ClassAdapter classAdapter = new ClassAdapter();
        classAdapter.electrify(1,2,4);
    }

}
