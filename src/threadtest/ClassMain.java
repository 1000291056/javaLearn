package threadtest;

/**
 * Created by wufeifei on 2016/5/19.
 */
public class ClassMain {

    public static void main(String[] args) {
        Goods goods=new Goods();
        ClassLoader loader=goods.getClass().getClassLoader();
       System.out.println(loader);
    }
}
