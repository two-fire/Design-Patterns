package strategy;

/**
 * 定义一个存放妙计的锦囊
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 使用计谋，出招
     */
    public void operate() {
        this.strategy.operate();
    }
}
