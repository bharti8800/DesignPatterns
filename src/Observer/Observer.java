package Observer;

public class Observer implements IObserver{
    
    private String name;
    
    public Observer(String name) {
        this.name = name;
    }
    
    public void update(String stmt) {
        System.out.println(name + " : "+ stmt);
    }

    @Override
    public void Swapfn(String stmt) {
        // TODO Auto-generated method stub
        System.out.println(name + " : "+ stmt);
    }

    @Override
    public void Comparisonfn(String stmt) {
        // TODO Auto-generated method stub
        System.out.println(name + " : "+ stmt);
    }
}
