package AbstractFactory.Sort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InternalSortAlgorithms<E> implements ITypeOfSort<E>{
    private List<ISort<E>> sortAlgos;
    @Override
    public List<E> sort(List<E> l) {
        // TODO Auto-generated method stub
        Iterator it = sortAlgos.iterator();
        while(it.hasNext()) {
            ((ISort)it.next()).sort(l);
        }
        return null;
    }
    
    public InternalSortAlgorithms() {
        this.sortAlgos = new ArrayList<ISort<E>>();
    }
    
    public void addAlgo(ISort<E> sortAlgo) {
        this.sortAlgos.add(sortAlgo);
    }
    
    public ISortIterator getSortAlgos(){
       // return this.sortAlgos;
        return new SortIterator(this.sortAlgos);
    }

    public ISortIterator getIterator() {
        return new SortIterator(this.sortAlgos);
    }
}
