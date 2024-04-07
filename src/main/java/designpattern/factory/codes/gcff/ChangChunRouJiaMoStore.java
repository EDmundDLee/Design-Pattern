package designpattern.factory.codes.gcff;




import designpattern.factory.codes.jdgc.RouJiaMo;

/**
 * @author lijiaxu
 * @Description
 * @date 2024/4/7 07:17
 */
public class ChangChunRouJiaMoStore extends RouJiaMoStore {

    private ChangChunSimpleRouJiaMoFactory changChunSimpleRouJiaMoFactory;


    public ChangChunRouJiaMoStore(ChangChunSimpleRouJiaMoFactory simpleRouJiaMoFactory) {
        this.changChunSimpleRouJiaMoFactory = simpleRouJiaMoFactory;
    }

    @Override
    public RouJiaMo sellRoujiaMo(String type) {
        RouJiaMo rouJiaMo = changChunSimpleRouJiaMoFactory.createRouJiaMo(type);
        rouJiaMo.pack();
        rouJiaMo.fire();
        return rouJiaMo;

    }
}
