package multition;

/**
 * 那大臣是比较悲惨了，两个皇帝呀，怎么拜呀，不管了，只要是个皇帝就成
 *
 * 有的大臣可是有骨气，只拜一个真神，你怎么处理？这个问题太简单，
 * getInstance(param)就解决了这个问题
 */
@SuppressWarnings("all")
public class Minister {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int ministerNum = 10; //十个大臣
        for (int i = 0; i < ministerNum; i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.print("第"+(i+1)+"个大臣参拜的是：");
            emperor.emperorInfo();
        }
    }
}
