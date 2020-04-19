package Extension;

import AbstractFactory.Sort.ISort;
import Observer.CountObserver;

public class CountExtension<E> extends IExtension<E> {
   CountObserver countObj;
    
   public void getExtendedSort(ISort<E> obj) {
       this.extSortAlgo = obj;
       this.countObj = new CountObserver();
       obj.addObserver(countObj);
      // System.out.println("i m called");
   }
   
   
   
   public String getCount() {
       System.out.println(extSortAlgo.getClass());
       StringBuilder str = new StringBuilder();
       str.append( "Swap Count - " + countObj.getSwapCount());
       str.append("Comparison Count" + countObj.getComparisonCount());
       return str.toString();
   }
}
