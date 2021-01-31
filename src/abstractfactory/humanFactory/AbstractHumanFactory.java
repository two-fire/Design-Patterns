package abstractfactory.humanFactory;

import abstractfactory.Human;
import abstractfactory.HumanEnum;
import abstractfactory.HumanFactory;

/**
 * 编写一个抽象类，根据enum创建一个人类出来
 */
public abstract class AbstractHumanFactory implements HumanFactory {
    /**
     * 给定一个性别人类，创建一个人类出来 专业术语是产生产品等级
     * 这个抽象类的目的就是减少MaleHumanFactory，FemaleHumanFactory实现类的代码量
     * 引入enum的好处：
     *  定义了参数必须是HumanEnum类型，所以直接使用humanEnum.getValue()方法就能获得具体传递进来的值
     */
    public Human createHuman(HumanEnum humanEnum) {
        Human human = null;
        //如果传递进来不是一个Enum中具体的一个Element的话，则不处理
        if (!"".equals(humanEnum.getValue())) {
            try {
                // 直接产生一个实例（人类）
                human = (Human)Class.forName(humanEnum.getValue()).newInstance();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return human;
    }
}
