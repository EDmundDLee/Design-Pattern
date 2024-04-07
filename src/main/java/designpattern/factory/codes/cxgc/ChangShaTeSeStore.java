package designpattern.factory.codes.cxgc;

/**
 * @author lijiaxu
 * @Description
 * @date 2024/4/7 06:47
 */
public class ChangShaTeSeStore extends RoujiaMoStore {
    private ChangShaSimpleRouJiaMoTeSeFactory factory;

    public ChangShaTeSeStore (ChangShaSimpleRouJiaMoTeSeFactory factory) {
        this.factory = factory;
    }

    @Override
    public RoujiaMo sellRoujiaMo(String type) {
        RoujiaMo rouJiaMo = factory.createRouJiaMo(type);
        rouJiaMo.prepare(new ChangShaTeSeYLFactory());
        rouJiaMo.fire();
        rouJiaMo.pack();
        return  rouJiaMo;
    }
}
