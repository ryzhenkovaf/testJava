public class Toy {
    private int id;                     
    private String name;                 
    private int quantity;               
    private double chance;            
    
    public Toy(int id, String name, int quantity, double frequency) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.chance = frequency;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getChance() {
        return chance;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setChance(double chance) {
        this.chance = chance;
    }
}