package AbstractFactory.Factory;

import AbstractFactory.Sort.ISort;
import AbstractFactory.Sort.InsertionSort;
import AbstractFactory.Sort.InternalSortAlgorithms;


public class Factory {

    private static Factory instance;
    
    private Factory() {
        
    }
    
    public static Factory getInstance() {
        if(instance == null)
            instance = new Factory();
        return instance;
    }
    
    public ISort getInsertionSortAlgo() {
        return new InsertionSort();
    }
    
    public ISort getInternalSortAlgo() {
        return new InternalSortAlgorithms();
    }
    
}
