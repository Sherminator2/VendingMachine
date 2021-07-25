public class Candy {

    private final String candyName;
    private final int unitCost;
    private int quantityAvailable;

    public Candy(String name, int cost, int available){
        candyName = name;
        unitCost = cost;
        quantityAvailable = available;
    }
    @Override
    public String toString(){
        return (candyName +
                " $" + unitCost + " - " +
                quantityAvailable + ": available");
    }
    public void dispenseCandy(){
        this.quantityAvailable--;
    }
    public int getUnitCost(){
        return this.unitCost;
    }
}
