package designpattern.factory.codes.jdgc;

/**
 * @author lijiaxu
 * @Description
 * @date 2024/4/7 09:09
 */
public  class RouJiaMoStore {
    private SimpleRouJiaMoFactory factory;

    public RouJiaMoStore(SimpleRouJiaMoFactory shenYangSimpleRouJiaMoFactory) {
        this.factory = shenYangSimpleRouJiaMoFactory;
    }



    public RouJiaMo sellRouJiaMo(String la) {
        RouJiaMo rouJiaMo = factory.createRouJiaMo("la");
        rouJiaMo.fire();
        rouJiaMo.pack();
        return rouJiaMo;
    }
}
