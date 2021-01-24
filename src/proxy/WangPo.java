package proxy;

public class WangPo implements KindWomen {

    private KindWomen kindWomen;

    // 默认是潘金莲的代理
    public WangPo() {
        kindWomen = new PanJinLian();
    }
    //她可以是KindWomen的任何一个女人的代理,只要她是这类女人
    public WangPo(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }

    //自己老了，干不了，可以让年轻的代替
    @Override
    public void makeEyesWithMan() {
        kindWomen.makeEyesWithMan();
    }
    @Override
    public void drinkWithMan() {
        kindWomen.drinkWithMan();
    }
}
