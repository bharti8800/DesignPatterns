package AbstractFactory.Sort;

import java.util.List;

public class InsertionSort<E> extends AbstractSort<E> implements ISort<E>  {

    @Override
    public List<E> sort(List<E> l){
        // TODO Auto-generated method stub
        return l;
    }
    
    public InsertionSort() {
        super("Insertion Sort");
    }

}
