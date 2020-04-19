package AbstractFactory.Sort;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import Extension.IExtension;
import Observer.IObserver;

public abstract class AbstractSort<E> implements ISort<E>{
    protected String name;
    protected List<IObserver> observers = new ArrayList<>();
    protected HashMap<String, IExtension> extList = new HashMap<>();
    
    
    @Override
    public void addObserver(IObserver ob) {
        observers.add(ob);
    }
    
    public void addExtension(String name, Class<? extends IExtension> Extclass) {
        try {
            IExtension extObj = Extclass.newInstance();
            try {
                Method methodToInvoke = Extclass.getMethod("getExtendedSort", ISort.class);
                try {
                    methodToInvoke.invoke(extObj, this);
                    this.extList.put(name,extObj);
                } catch (IllegalArgumentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            } catch (NoSuchMethodException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (SecurityException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public void removeExtension(String name) {
        this.extList.remove(name);
    }
    
    public IExtension getExtension(String name) {
        return this.extList.get(name);
    }
    
    public String getName() {
        return this.name;
    }
    
    public AbstractSort(String name) {
        this.name = name;
    }
    
    public void notify1(String stmt) {
        Iterator it = this.observers.iterator();
        while(it.hasNext()) {
            IObserver x = (IObserver) it.next();
            x.update(stmt);
            x.Swapfn(stmt);
        }
    }
    
    public void notify2(String stmt) {
        Iterator it = this.observers.iterator();
        while(it.hasNext()) {
            IObserver x = (IObserver) it.next();
            x.update(stmt);
        }
    }
    
}
