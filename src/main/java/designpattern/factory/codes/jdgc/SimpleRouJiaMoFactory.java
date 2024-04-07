package designpattern.factory.codes.jdgc;



/**
 * @author lijiaxu
 * @Description
 * @date 2024/4/7 09:04
 */
public class SimpleRouJiaMoFactory {

    public RouJiaMo createRouJiaMo(String type) {
        RouJiaMo roujiaMo = null;
        switch (type) {
            case "la":
                roujiaMo = new LaRouJiaMo();
                break;
            case "xianrou":
                roujiaMo = new XianRouRouJiaMo();
                break;
            default:
                roujiaMo = new LaRouJiaMo();

        }


        return  roujiaMo;
    }
}
