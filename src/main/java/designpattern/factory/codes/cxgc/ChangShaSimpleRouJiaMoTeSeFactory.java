package designpattern.factory.codes.cxgc;

/**
 * @author lijiaxu
 * @Description
 * @date 2024/4/7 06:49
 */
public class ChangShaSimpleRouJiaMoTeSeFactory {

    public RoujiaMo createRouJiaMo (String type) {
        RoujiaMo roujiaMo  = null;
        switch (type) {
            case "suan" :
                roujiaMo =  new ChangShaSuanRouJiaMo();
            case "la":
                roujiaMo = new  ChangShaLaRouJiaMo();

            default:
                roujiaMo =  new ChangShaSuanRouJiaMo();
        }
        return roujiaMo;
    }
}
