package abstractfactory;

import factorymethod.Human;

public abstract class AbstractYellowHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黄色人类会温和地笑");
    }

    public void cry() {
        System.out.println("黄色人类会哭");
    }

    @Override
    public void talk() {
        System.out.println("黄色人类会说话，一般说的都是双字节!");
    }
}
