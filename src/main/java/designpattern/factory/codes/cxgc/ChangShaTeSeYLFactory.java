package designpattern.factory.codes.cxgc;

/**
 * @author lijiaxu
 * @Description
 * @date 2024/4/7 06:40
 */
public class ChangShaTeSeYLFactory implements RoujiaMoYLFactory{
    @Override
    public Meet creatMeet() {
        return new ChangShaTeSeMeet();
    }

    @Override
    public YuanLiao creatYuanLiao() {
        return new ChangShaTeSeYuanLiao();
    }
}
