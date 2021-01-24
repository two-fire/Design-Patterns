package singleton1;

/**
 * 定义一个皇帝，中国历史一般都是一朝代一个皇帝
 */
public class Emperor {
    private static Emperor emperor = null; // 定义一个皇帝，然后给他名字

    public Emperor() {
    }

    /**
     * 获取实例
     * @return
     */
    public static Emperor getInstance() {
        if (emperor == null) { // 如果皇帝还没有定义，就定义一个
            emperor = new Emperor();
        }
        return emperor;
    }

    // 皇帝叫什么？
    public static void emperorInfo() {
        System.out.println("我就是皇帝某某某....");
    }
}
