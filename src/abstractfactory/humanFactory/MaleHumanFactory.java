package abstractfactory.humanFactory;

import abstractfactory.Human;
import abstractfactory.HumanEnum;

/**
 * 男性创建工厂
 */
public class MaleHumanFactory extends AbstractHumanFactory{
    // 创建一个男性黄种人
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloMaleHuman);
    }
    // 创建一个男性种白人
    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }
    // 创建一个男性黑种人
    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }
}
