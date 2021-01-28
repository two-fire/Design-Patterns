package abstractfactory;

import factorymethod.Human;

public abstract class AbstractWhiteHuman implements Human {

    @Override
    public void laugh() {
        System.out.println("白色人类会侵略地笑");
    }

    @Override
    public void cry() {
        System.out.println("白色人类会哭");
    }

    @Override
    public void talk() {
        System.out.println("白色人类会说话，一般都是但是单字节！");
    }
}

