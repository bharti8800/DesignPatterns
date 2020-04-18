package Decorator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import AbstractFactory.Sort.ISort;

public class EncryptSortDecorator<E> extends AbstractSortDecorator<E>{

    public EncryptSortDecorator(ISort sortAlgo) {
        super(sortAlgo);
        // TODO Auto-generated constructor stub
    }
    
    public List<E> postSort(List<E> l) {
        
        List<E> newList = new ArrayList<E>();
        
        Iterator<E> it = l.iterator();
        while(it.hasNext()) {
            newList.add((E)String.valueOf((it.next().toString()).hashCode()));
        }
        return newList;
        
    }

}
