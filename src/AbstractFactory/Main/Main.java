package AbstractFactory.Main;

import java.util.Arrays;
import java.util.List;

import AbstractFactory.Factory.Factory;
import AbstractFactory.Sort.ISort;
import AbstractFactory.Sort.ISortIterator;
import AbstractFactory.Sort.ITypeOfSort;
import AbstractFactory.Sort.InsertionSort;
import Decorator.EncryptSortDecorator;
import Decorator.ToLowerCase;
import Observer.Observer;


public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<String> l = Arrays.asList(new String[] {"Cat", "Rat", "Bat"}) ;
        
        ISort s = (ISort) Factory.getInstance().getInsertionSortAlgo();
        
        System.out.println(new EncryptSortDecorator(new ToLowerCase(s)).sort(l));
        ITypeOfSort y = (ITypeOfSort) Factory.getInstance().getInternalSortAlgo();
        y.addAlgo(new InsertionSort());
        y.addAlgo(new InsertionSort());
        y.addObserver(new Observer("kitty"));
        y.addObserver(new Observer("golden"));
        System.out.println(new ToLowerCase(y).sort(l));
        ISortIterator sortingAlgosIterator = y.getSortAlgos();
        System.out.println(sortingAlgosIterator.hasNext());
        
    }

}
