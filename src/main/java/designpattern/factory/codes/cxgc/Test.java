package designpattern.factory.codes.cxgc;

/**
 * @author lijiaxu
 * @Description
 * @date 2024/4/1 16:33
 */
public class Test {

    public static void main(String[] args) {
        ChangShaTeSeStore changShaTeSeStore = new ChangShaTeSeStore(new ChangShaSimpleRouJiaMoTeSeFactory());
        RoujiaMo roujiaMo = changShaTeSeStore.sellRoujiaMo("la");
        System.out.println(roujiaMo.name);
    }
}
