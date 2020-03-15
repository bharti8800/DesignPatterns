package Sort.Client;

import Sort.ISort;
import Sort.Abstract_Factory.Factory;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ISort s = Factory.getInstance().getSortAlgo();
        s.sort(null);
    }

}
