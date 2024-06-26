package designpattern.factory.codes.cxgc;

/**.
 * 西安的肉夹馍原料工厂,是西安的特色原料,还有其他分店的特色原料
 */

public class XianRoujiaMoYLFoctory implements RoujiaMoYLFactory {

    @Override
    public Meet creatMeet() {
        return new XianFreshMeet();
    }

    @Override
    public YuanLiao creatYuanLiao() {
        return new XianTeSeYuanLiao();
    }
}
