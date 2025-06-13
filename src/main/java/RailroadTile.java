public class RailroadTile extends PropertyTile {
    private String name;
    public RailroadTile(String name, int price, double rent) {
        super(name, price, rent);
        this.name = name;
    }
    public void landOn(Player player) {
        if (getOwner() != null){
            System.out.println(player.getName() + " landed on " + name + ". No rent is charged.");
        }
        else{
            System.out.println(player.getName() + " landed on " + name + ". Do you want to buy this Railroad");
        }
    }
}