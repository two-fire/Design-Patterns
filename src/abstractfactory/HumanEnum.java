package abstractfactory;

/**
 * 枚举出世界上有哪些类型的人
 */
public enum HumanEnum {
    //把世界上所有人类型都定义出来
    YellowMaleHuman("abstractfactory.yellowHuman.YellowMaleHuman"),
    YellowFemaleHuman("abstractfactory.yellowHuman.YellowFemaleHuman"),
    WhiteMaleHuman("abstractfactory.whiteHuman.WhiteMaleHuman"),
    WhiteFemaleHuman("abstractfactory.whiteHuman.WhiteFemaleHuman"),
    BlackMaleHuman("abstractfactory.blackHuman.BlackMaleHuman"),
    BlackFemaleHuman("abstractfactory.blackHuman.BlackFemaleHuman");

    private String value = "";
    //定义构造函数，目的是Data(value)类型的相匹配
    private HumanEnum(String value){
        this.value = value;
    }

    //获得枚举类型中一个元素的值
    public String getValue() {
        return value;
    }
    /*
     * java enum类型尽量简单使用，尽量不要使用多态、继承等方法
     * 毕竟用Clas完全可以代替enum
     */
}
