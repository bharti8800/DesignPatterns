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
import Extension.CountExtension;
import Extension.IExtension;
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
       // ISort ze =  Factory.getInstance().getInsertionSortAlgo();
       // ze.addExtension("Stats", CountExtension.class);
        y.addExtension("Stats1", CountExtension.class);
        
        
        y.addObserver(new Observer("kitty"));
        y.addObserver(new Observer("golden"));
        //IExtension z = ze.getExtension("Stats");
        //IExtension z2 = y.getExtension("Stats1");
        //ze.sort(l);
        System.out.println(new EncryptSortDecorator(y).sort(l));
        
        //System.out.println(((CountExtension) z).getCount());
        ISortIterator sortingAlgosIterator = y.getSortAlgos();
        System.out.println(sortingAlgosIterator.hasNext());
        
        while(sortingAlgosIterator.hasNext()) {
            ISort algo = sortingAlgosIterator.next();
            CountExtension individualExt = (CountExtension)algo.getExtension("Stats1");
            System.out.println(individualExt.getCount());
        }
    }

}
