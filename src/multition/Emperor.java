package multition;

import java.util.ArrayList;
import java.util.Random;

@SuppressWarnings("all")
public class Emperor {
    private static int maxNumOfEmperor = 2; //最多只能有连个皇帝
    private static ArrayList emperorInfoList = new ArrayList(maxNumOfEmperor); //皇帝叫什么名字
    private static ArrayList emperorList = new ArrayList(maxNumOfEmperor); //皇帝列表
    private static int countNumOfEmperor = 0; //正在被人尊称的那位皇帝
    // 先产生2个皇帝
    static {
//把所有的皇帝都产生出来
        for(int i=0;i<maxNumOfEmperor;i++) {
            emperorList.add(new Emperor("皇" + (i + 1) + "帝"));
        }
    }

    // 就这么多皇帝了，不允许再推举一个皇帝(new 一个皇帝）
    public Emperor() {
        //世俗和道德约束你，目的就是不让你产生第二个皇帝
    }

    private Emperor(String info) {
        emperorList.add(info);
    }

    public static Emperor getInstance() {
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor); //随机选出一位作为百姓的精神领袖皇帝
        return (Emperor)emperorList.get(countNumOfEmperor);
    }
    //皇帝叫什么名字?
    public static void emperorInfo() {
        System.out.println(emperorInfoList.get(countNumOfEmperor));
    }

}


