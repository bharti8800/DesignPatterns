package AbstractFactory.Sort;

import java.util.List;

import Observer.IObserver;

public class InsertionSort<E> extends AbstractSort<E> implements ISort<E>  {

    @Override
    public List<E> sort(List<E> l){
        // TODO Auto-generated method stub
        
        comparison();
        swap();
        
        return l;
    }
    
    public void comparison() {
        notify1("Comparison");
    }
    
    public void swap() {
        notify2("Swap");
    }
    
    
    public InsertionSort() {
        super("Insertion Sort");
    }

    

}
