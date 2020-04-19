package Decorator;

import java.util.List;

import AbstractFactory.Sort.ISort;
import Extension.IExtension;
import Observer.IObserver;

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
    
    public void addObserver(IObserver ob) {
        // TODO Auto-generated method stub
        this.DecoratedSortAlgo.addObserver(ob);
    }
    
    @Override
    public void addExtension(String name, Class<? extends IExtension> cls) {
        // TODO Auto-generated method stub
        this.DecoratedSortAlgo.addExtension(name, cls);
    }

    @Override
    public void removeExtension(String name) {
        // TODO Auto-generated method stub
        this.DecoratedSortAlgo.removeExtension(name);
    }

    @Override
    public IExtension getExtension(String name) {
        // TODO Auto-generated method stub
        return this.DecoratedSortAlgo.getExtension(name);
    }
}
