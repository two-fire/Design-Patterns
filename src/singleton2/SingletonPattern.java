package singleton2;

/**
 * 单例模式就是在构造函数中多加了一个构造函数，访问权限是private就可以了。
 * 简单但有风险:
 *  例如两个线程A,B，A正在执行new申请内存分配，可能需要0.001微秒，
 *      B执行到this.singletonPatton == null，这时候判断条件是true还是false？
 *      如果是true，那么内存中不就存在了两个SingletonPattern的实例。
 *      如果这个单例是创建一个信号资源，就会出现业务逻辑混乱！
 */
@SuppressWarnings("all")
public class SingletonPattern {
    private static SingletonPattern singletonPattern = null;
    // 限制住不能直接产生一个实例
    private SingletonPattern() {
    }

    /**
     * 获取实例
     * @return
     */
    public SingletonPattern getInstance() {
        if (this.singletonPattern == null) { //如果还没有实例，则创建一个
            this.singletonPattern = new SingletonPattern();
        }
        return this.singletonPattern;
    }

}
