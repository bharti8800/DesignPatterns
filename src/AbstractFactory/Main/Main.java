package AbstractFactory.Main;

import java.util.List;

import AbstractFactory.Factory.Factory;
import AbstractFactory.Sort.ISort;


public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<String> l = null;
        
        ISort s = (ISort) Factory.getInstance().getInsertionSortAlgo();
        s.sort(l);
        ISort y = (ISort) Factory.getInstance().getInternalSortAlgo();
        y.sort(l);
    }

}
