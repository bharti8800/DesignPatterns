package AbstractFactory.Main;

import java.util.List;

import AbstractFactory.Factory.Factory;
import AbstractFactory.Sort.ISort;
import AbstractFactory.Sort.ISortIterator;
import AbstractFactory.Sort.ITypeOfSort;
import AbstractFactory.Sort.InsertionSort;


public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<String> l = null;
        
        ISort s = (ISort) Factory.getInstance().getInsertionSortAlgo();
        s.sort(l);
        ITypeOfSort y = (ITypeOfSort) Factory.getInstance().getInternalSortAlgo();
        y.addAlgo(new InsertionSort());
        y.sort(l);
        ISortIterator sortingAlgosIterator = y.getSortAlgos();
        System.out.println(sortingAlgosIterator.hasNext());
        
    }

}
