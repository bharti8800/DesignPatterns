package AbstractFactory.Sort;

public abstract class AbstractSort<E> implements ISort<E>{
    protected String name;

    public String getName() {
        return this.name;
    }
    
    public AbstractSort(String name) {
        this.name = name;
    }
}
