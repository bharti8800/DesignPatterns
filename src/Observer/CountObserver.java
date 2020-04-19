package Observer;

public class CountObserver implements IObserver {
    private int swapCount;
    private int comparisonCount;
    @Override
    public void update(String stmt) {
        // TODO Auto-generated method stub

    }

    public void Swapfn(String stmy) {
        this.swapCount++;
    }
    
    public void Comparisonfn(String stmy) {
        this.comparisonCount++;
    }
    
    public int getSwapCount() {
        return this.swapCount;
    }
    
    public int getComparisonCount() {
        return this.comparisonCount;
    }

   
}
