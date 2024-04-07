package designpattern.factory.codes.gcff;


import designpattern.factory.codes.jdgc.RouJiaMo;

/**
 * @author lijiaxu
 * @Description
 * @date 2024/4/7 07:28
 */
public class Test {

    public static void main(String[] args) {
        ChangChunRouJiaMoStore chunRouJiaMoStore = new ChangChunRouJiaMoStore(new ChangChunSimpleRouJiaMoFactory());
        RouJiaMo rouJiaMo = chunRouJiaMoStore.sellRoujiaMo("la");
    }
}
