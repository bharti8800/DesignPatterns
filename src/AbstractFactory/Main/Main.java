package AbstractFactory.Main;

import java.util.List;

import AbstractFactory.Factory.Factory;
import AbstractFactory.Sort.ISort;


public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<String> l = null;
        
        ISort s = (ISort) new Factory().getSortAlgo();
        s.sort(l);
    }

}
