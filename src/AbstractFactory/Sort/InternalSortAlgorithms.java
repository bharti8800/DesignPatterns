package AbstractFactory.Sort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Extension.IExtension;
import Observer.IObserver;
import Observer.Observer;

public class InternalSortAlgorithms<E> extends AbstractSort<E> implements ITypeOfSort<E>{
    
    private List<IObserver> observerList = new ArrayList<>();
    private List<ISort<E>> sortAlgos;
    @Override
    public List<E> sort(List<E> l) {
        // TODO Auto-generated method stub
        Iterator it = sortAlgos.iterator();
        while(it.hasNext()) {
            ISort algo = (ISort)it.next();
            (algo).sort(l);
            String stmt = "Sorting the list using " + algo.getName();
           // notify1(stmt);
            
        }
        return l;
    }
    
    public void addObserver(IObserver ob) {
        this.observerList.add(ob);
    }
    
    public void removeObserver(Observer ob) {
        this.observerList.remove(ob);
    }
    
    public void notify1(String stmt) {
        Iterator it = this.observerList.iterator();
        while(it.hasNext()) {
            Observer ob = (Observer)it.next();
            ob.Swapfn(stmt);
        }
    }
    
    public InternalSortAlgorithms() {
        super("Internal sort");
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
    
    public void addExtension(String name, Class<? extends IExtension> cls) {
        ISortIterator sortIterator = this.getIterator();
        while(sortIterator.hasNext()) {
            ISort sort = sortIterator.next();
            sort.addExtension(name, cls);
            System.out.println("Adding ext to "+ sort.getName());
        }
    }
    
}
