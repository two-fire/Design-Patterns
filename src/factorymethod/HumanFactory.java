package factorymethod;

public class HumanFactory {
    //定一个烤箱，泥巴塞进去，人就出来
    public static Human createHuman(Class c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance(); //产生一个人类
        } catch (InstantiationException e) {//你要是不说个人类颜色的话，没法烤，要白的黑，你说话了才好烤
            System.out.println("必须指定人类的颜色");
        } catch (IllegalAccessException e) {//定义的人类有问题，那就烤不出来了，这是..
            System.out.println("人类定义错误！");
        } catch (ClassNotFoundException e) {//你随便说个人类，我到哪里给你制造去
            System.out.println("混蛋，你指定的人类找不到！");
        }
        return human;
    }
}
