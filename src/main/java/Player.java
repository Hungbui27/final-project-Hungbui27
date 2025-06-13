import javax.swing.*;
import java.util.ArrayList;

public class Player {
    private String name;
    private int money;
    private int position;
    private ArrayList<PropertyTile> properties;

    public Player(String name) {
        this.name = name;
        this.money = 1500;
        this.position = 0;
        this.properties = new ArrayList<>();
    }

    public void addProperty(PropertyTile property) {
        properties.add(property);
        property.setOwner(this);
    }
    public ArrayList<PropertyTile> getProperties() {
        return properties;
    }

    public int getRailroadCount() {
        int count = 0;
        for (Tile tile : properties) {
            if (tile instanceof RailroadTile) {
                count++;
            }
        }
        return count;
    }

    public void addMoney(int amount) {
        money += amount;
    }

    public void move(int roll, int boardSize) {
        int newPos = position + roll;

        if (newPos >= boardSize) {

            newPos = newPos % boardSize;
            JOptionPane.showMessageDialog(null, "These are your current property: " + properties.toString());
            for (PropertyTile property : properties) {
                property.increaseRentByTenPercent();
            }
            int bonus = 50 * getRailroadCount();
            addMoney(bonus);
            addMoney(200);
            JOptionPane.showMessageDialog(null, "Updated balance of " + name + ": "+ money);
            System.out.println(name + " passed GO and earned $200 +" + bonus + " for owning railroads.");
        }

        position = newPos;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
