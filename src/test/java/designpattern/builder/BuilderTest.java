package designpattern.builder;

import designpattern.builder.code.BenzModel;
import designpattern.builder.code.Director;
import org.junit.jupiter.api.Test;

/**
 * @author lijiaxu
 * @Description
 * @date 2024/6/19 15:16
 */
public class BuilderTest {


    @Test
    void directorTest() {
        Director director = new Director();
        BenzModel aBenzModel = director.getABenzModel();
        aBenzModel.run();
    }
}
