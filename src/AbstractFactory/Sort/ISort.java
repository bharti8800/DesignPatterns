package AbstractFactory.Sort;

import java.util.List;

public interface ISort<E> {
    
    public String getName();
    public List<E> sort(List<E> l);
}
