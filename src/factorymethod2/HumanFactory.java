package factorymethod2;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * 工厂模式还有一个非常重要的应用，就是延迟化。
 * 这个在类初始化很消耗资源的情况比较实用，通过这种方式可以很好的减少项目的复杂程度
 * 在代码中增加MAP即可。
 */
public class HumanFactory {
    //定义一个MAP,初始化过的Human对象都放在这里
    private static HashMap<String, Human> humans = new HashMap<>();
    //定一个烤箱，泥巴塞进去，人就出来
    public static Human createHuman(Class c) {
        Human human = null;
        try {
            //如果MAP中有，则直接从取出，不用初始化了
            if (humans.containsKey(c.getSimpleName())) {
                human = humans.get(c.getSimpleName());
            } else
                human = (Human) Class.forName(c.getName()).newInstance(); //产生一个人类
                humans.put(c.getSimpleName(), human);
        } catch (InstantiationException e) {//你要是不说个人类颜色的话，没法烤，要白的黑，你说话了才好烤
            System.out.println("必须指定人类的颜色");
        } catch (IllegalAccessException e) {//定义的人类有问题，那就烤不出来了，这是..
            System.out.println("人类定义错误！");
        } catch (ClassNotFoundException e) {//你随便说个人类，我到哪里给你制造去
            System.out.println("混蛋，你指定的人类找不到！");
        }
        return human;
    }

    //女娲把一团泥巴塞到八卦炉，爱产生啥人类就啥人类
    public static Human createHuman() {
        Human human=null;  //定义一个类型的人类
        // 首先获得有多少个实现类，多少个人类
        List<Class> concreteHumanList =
                ClassUtils.getAllClassByInterface(Human.class); //定义了多少人类
        //八卦炉自己开始想烧出什么人就什么人
        Random random = new Random();
        int rand = random.nextInt(concreteHumanList.size());
        human = createHuman(concreteHumanList.get(rand));
        return human;
    }
}
