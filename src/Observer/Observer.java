package Observer;

public class Observer{
    
    private String name;
    
    public Observer(String name) {
        this.name = name;
    }
    
    public void update(String stmt) {
        System.out.println(name + " : "+ stmt);
    }
}
