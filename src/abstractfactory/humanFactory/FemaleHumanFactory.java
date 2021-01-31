package abstractfactory.humanFactory;

import abstractfactory.Human;
import abstractfactory.HumanEnum;

/**
 * 女性创建工厂
 */
public class FemaleHumanFactory extends AbstractHumanFactory{
    // 创建一个女性黄种人
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YellowFemaleHuman);
    }
    // 创建一个女性种白人
    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }
    // 创建一个女性黑种人
    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }
}
