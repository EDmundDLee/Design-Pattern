package designpattern.factory.codes.jdgc;

/**
 * @author lijiaxu
 * @Description
 * @date 2024/4/7 09:15
 */
public class Test {
    public static void main(String[] args) {
        RouJiaMoStore rouJiaMoStore = new RouJiaMoStore(new SimpleRouJiaMoFactory());
        RouJiaMo rouJiamo = rouJiaMoStore.sellRouJiaMo("la");
        System.out.println(rouJiamo.name);
    }
}
