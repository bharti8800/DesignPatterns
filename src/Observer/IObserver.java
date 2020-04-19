package Observer;

public interface IObserver<E> {
    
    public void update(String stmt);
    public void Swapfn(String stmt);
    public void Comparisonfn(String stmt);
   
}
