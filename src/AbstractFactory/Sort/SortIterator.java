package AbstractFactory.Sort;

import java.util.List;

public class SortIterator<E> implements ISortIterator<E> {
    private List<ISort<E>> listOfAlgos;
    int counter = 0;
    public SortIterator(List<ISort<E>> list) {
        this.listOfAlgos = list;
    }
    
    @Override
    public boolean hasNext() {
        return (counter<=listOfAlgos.size()-1);
    }

    @Override
    public ISort<E> next() {
        ISort<E> temp = listOfAlgos.get(counter);
        counter++;
        return temp;
    }

}
