package designpattern.factory.codes.gcff;

import designpattern.factory.codes.jdgc.RouJiaMo;
import designpattern.factory.codes.jdgc.SimpleRouJiaMoFactory;

/**
 * @author lijiaxu
 * @Description
 * @date 2024/4/7 07:23
 */
public class ChangChunSimpleRouJiaMoFactory {

    public RouJiaMo createRouJiaMo (String type) {
        RouJiaMo rouJiaMo = null;
        switch (type){
            case "la":
                rouJiaMo = new ChangChunLaRouJiaMo();
            default:
                rouJiaMo = new ChangChunLaRouJiaMo();
        }
        return rouJiaMo;
    }

}
