package AbstractFactory.Sort;

import java.util.ArrayList;
import java.util.List;

public class InternalSortAlgorithms<E> implements ISort<E>{
    private List<ISort<E>> sortAlgos;
    @Override
    public List<E> sort(List<E> l) {
        // TODO Auto-generated method stub
        for(ISort<E> sortalgo : sortAlgos) {
            sortalgo.sort(l);
        }
        return null;
    }
    
    public InternalSortAlgorithms() {
        this.sortAlgos = new ArrayList<ISort<E>>();
    }
    
    public void addAlgo(ISort<E> sortAlgo) {
        this.sortAlgos.add(sortAlgo);
    }
    

}
