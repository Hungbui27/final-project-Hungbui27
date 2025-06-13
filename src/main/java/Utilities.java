public class Utilities extends RailroadTile {
    private String name;
    public  Utilities (String name, int price, double rent){
        super(name, price, rent);
    }
    public void landOn(Player player) {
        if (getOwner() == player){
            int Diceroll1 = (int) (Math.random() * 5)+1;
            int Diceroll2 = (int) (Math.random() * 5)+1;
            player.addMoney((Diceroll1 + Diceroll2) * 20);
            System.out.println("You are the owner of this Utility, " + "Rolling Dice: " + Diceroll1 +" + "+ Diceroll2);

        }
        else{
            System.out.println(player.getName() + " landed on " + name + ". Nothing happen");
        }
    }
}
