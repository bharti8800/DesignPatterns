package AbstractFactory.Sort;

import java.util.Iterator;

public interface ISortIterator<E> {
   
    public boolean hasNext();
    public ISort<E> next();
    
}
