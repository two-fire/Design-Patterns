package proxy;

/**
 * 代理模式：
 *  1. 定义一类女人，可以抛媚眼和陪酒。
 *  2. 潘金莲、贾氏均继承这类女人，完成相关的抛媚眼和陪酒活动。
 *  3. 定义王婆，指定完成抛媚眼和陪酒活动的对象。
 *  4. 定义西门庆，叫出王婆，王婆派人出来进行活动。
 *
 * 王婆作为潘金莲的代理人，为西门庆和潘金莲牵线并收好处费。
 * 如果没有王婆，他们不一定能成。
 */
public class XiMenQing {
    public static void main(String[] args) {
        // 叫王婆出来
//        WangPo wangPo = new WangPo();
        WangPo wangPo = new WangPo(new JiaShi());

        // 西门庆说要潘金莲陪
        wangPo.makeEyesWithMan();
        wangPo.drinkWithMan();
    }

}
