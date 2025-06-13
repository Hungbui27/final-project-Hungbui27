public class PropertyTile extends Tile {
    private double rent;
    private Player owner;

    public PropertyTile(String name, int price, double rent) {
        super(name, price);
        this.rent = rent;
        this.owner = null;
    }


    public double getRent() {
        return rent;
    }
    public void increaseRentByTenPercent() {
        rent += rent * 0.10;
    }
    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }
}
