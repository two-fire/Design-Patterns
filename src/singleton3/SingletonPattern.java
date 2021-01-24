package singleton3;

/**
 * 通用单例模式
 *  直接 new 一个对象传递给类的成员变量 singletonpattern，你要的时候 getInstance()
 *  直接返回给你，解决问题！
 */
@SuppressWarnings("all")
public class SingletonPattern {
    private static final SingletonPattern singletonPattern = new SingletonPattern();

    // 限制住不能直接产生一个实例
    private SingletonPattern() {
    }

    public synchronized static SingletonPattern getInstance() {
        return singletonPattern;
    }

}
