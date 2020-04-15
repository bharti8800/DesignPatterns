package AbstractFactory.Sort;

import java.util.List;

public interface ITypeOfSort<E> extends ISort<E> {
    
    public ISortIterator getSortAlgos();
    
    public ISortIterator getIterator();
    public void addAlgo(ISort<E> sortAlgo);
}
