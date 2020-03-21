package AbstractFactory.Factory;

import AbstractFactory.Sort.ISort;
import AbstractFactory.Sort.InsertionSort;


public class Factory {

    public ISort getSortAlgo() {
        return new InsertionSort();
    }
    
}
