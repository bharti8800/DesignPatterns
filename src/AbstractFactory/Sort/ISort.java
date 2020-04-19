package AbstractFactory.Sort;

import java.util.List;

import Extension.IExtension;
import Observer.IObserver;
import Observer.Observer;

public interface ISort<E> {
    
    public String getName();
    public void addObserver(IObserver ob);
    public List<E> sort(List<E> l);
    public void addExtension(String name, Class<? extends IExtension> cls);
    public void removeExtension(String name);
    public IExtension getExtension(String name);
}
