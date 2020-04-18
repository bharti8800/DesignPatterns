package Decorator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import AbstractFactory.Sort.ISort;

public class ToLowerCase<E> extends AbstractSortDecorator<E> {

    public ToLowerCase(ISort sortAlgo) {
        super(sortAlgo);
        // TODO Auto-generated constructor stub
    }
    
    public List<E> sort(List<E> l) {
        List<E> newList = new ArrayList<>();
        Iterator it = l.iterator();
        while(it.hasNext()) {
            newList.add((E)it.next().toString().toLowerCase());
        }
        
        return DecoratedSortAlgo.sort(newList);
    }

}
