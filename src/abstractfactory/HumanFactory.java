package abstractfactory;

/**
 * 这次定一个接口，应该要造不同性别的人，需要不同的生产线
 */
public interface HumanFactory {
    //制造一个黄色人类
    public Human createYellowHuman();

    //制造一个白色人类
    public Human createWhiteHuman();

    //制造一个黑色人类
    public Human createBlackHuman();
}
