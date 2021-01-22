package strategy;

/**
 * 策略模式：
 *  1. 定义一个三个锦囊妙计的策略接口
 *  2. 分别实现三个妙计：
 *      1）找乔国老帮忙，让吴国太给孙权施加压力
 *      2）求吴国太开个绿灯,放行！
 *      3）孙夫人断后，挡住追兵
 *  3. 定义一个存放妙计的锦囊
 *  4. 赵云使用三个妙计
 *
 * 策略模式的好处就是：
 *  1. 高内聚低耦合
 *  2. 扩展性：策略类可以继续增加下去，只需要修改Context.java即可
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context;
        // 刚刚到吴国，拆第一个
        System.out.println("--------刚刚到吴国，拆第一个--------");
        context = new Context(new BackDoor()); // 拿到妙计
        context.operate(); // 拆开执行
        System.out.println("\n\n");

        // 刘备乐不思蜀，拆第二个
        System.out.println("--------刘备乐不思蜀，拆第二个--------");
        context = new Context(new GivenGreenLight()); // 拿到妙计
        context.operate(); // 拆开执行
        System.out.println("\n\n");

        //孙权的小兵追来了，拆第三个
        System.out.println("--------孙权的小兵追来了，拆第三个--------");
        context = new Context(new BlockEnemy()); // 拿到妙计
        context.operate(); // 拆开执行
        System.out.println("\n\n");
    }
}
