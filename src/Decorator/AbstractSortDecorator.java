package Decorator;

import java.util.List;

import AbstractFactory.Sort.ISort;

public abstract class AbstractSortDecorator<E> implements ISort<E>{

    protected ISort DecoratedSortAlgo;
    
    public AbstractSortDecorator(ISort sortAlgo) {
        this.DecoratedSortAlgo = sortAlgo;
    }
    
    public String getName() {
        // TODO Auto-generated method stub
        return DecoratedSortAlgo.getName();
    }
    
    public List<E> preSort(List<E> l){
        return l;
    }
    
    public List<E> postSort(List<E> l){
        return l;
    }
    
    @Override
    public List<E> sort(List<E> l) {
        
        List<E> l1 = preSort(l);
        List<E> l2 = DecoratedSortAlgo.sort(l1);
        List<E> l3 = postSort(l2);
        // TODO Auto-generated method stub
        return l3;
    }
    
    
    
}
