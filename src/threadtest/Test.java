package threadtest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wufeifei on 2016/5/18.
 */
public class Test {
    public static void main(String[] args) {
        List list=new ArrayList<Goods>(){
            @Override
            public Goods get(int index) {
                return super.get(index);
            }

            @Override
            public boolean add(Goods goods) {
                return super.add(goods);
            }

            @Override
            public void add(int index, Goods element) {
                super.add(index, element);
            }
        };
    }
}
