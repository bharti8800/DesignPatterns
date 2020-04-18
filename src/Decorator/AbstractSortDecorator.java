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

    @Override
    public List<E> sort(List<E> l) {
        // TODO Auto-generated method stub
        return DecoratedSortAlgo.sort(l);
    }
    
    
    
}
