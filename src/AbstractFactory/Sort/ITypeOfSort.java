package AbstractFactory.Sort;

import java.util.List;

import Observer.Observer;

public interface ITypeOfSort<E> extends ISort<E> {
    
    public void addObserver(Observer ob);
    
    public ISortIterator getSortAlgos();
    
    public ISortIterator getIterator();
    public void addAlgo(ISort<E> sortAlgo);
}
