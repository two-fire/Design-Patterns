package singleton1;

/**
 * 定义大臣
 *  大臣每天见皇帝，今天、昨天、前天皇帝不可以不一样！
 *
 *  三天见的皇帝都是同一个人，不会产生错乱情况。
 *  只要大家提到皇帝，就知道指的是谁，清晰明确。问题是如果一个朝代有两个皇帝怎么办？
 */
@SuppressWarnings("all") // 告诉它对被批注的代码元素内部的某些警告保持静默
public class Minister {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // 第一天
        Emperor emperor1 = Emperor.getInstance();
        emperor1.emperorInfo(); // 第一天的皇帝叫什么名字？

        // 第二天
        Emperor emperor2 = Emperor.getInstance();
        emperor2.emperorInfo(); // 第二天的皇帝叫什么名字？

        // 第三天
        Emperor emperor3 = Emperor.getInstance();
        emperor3.emperorInfo(); // 第三天的皇帝叫什么名字？

    }
}
