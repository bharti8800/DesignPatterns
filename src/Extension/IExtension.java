package Extension;

import AbstractFactory.Sort.ISort;

public abstract class IExtension<E> {

    ISort<E> extSortAlgo;
    
    public abstract void getExtendedSort(ISort<E> obj);
}
