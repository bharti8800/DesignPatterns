package Sort.Abstract_Factory;

import Sort.ISort;
import Sort.InsertionSort;

public class Factory {

    private static Factory factoryInstance;
    public ISort getSortAlgo() { 
        return new InsertionSort();
    }
    
    private Factory() {
        
    }
    
    public static Factory getInstance() {
        if(factoryInstance == null) {
            factoryInstance = new Factory();
        }
        return factoryInstance;
    }
    
}
