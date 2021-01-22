package strategy;

/**
 * 实现第二个妙计：求吴国太开个绿灯,放行！
 */
public class GivenGreenLight implements IStrategy{
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯,放行！");
    }
}
