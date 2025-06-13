import javax.swing.*;
import java.util.ArrayList;

public class GameController {
    private Board board;
    public ArrayList<Player> n;
    public int currentPlayer;

    public GameController(Board board, ArrayList<Player> n) {
        this.board = board;
        this.n = n;
        this.currentPlayer = 0;
        n.add(new Player("Player 1"));
        n.add(new Player("Player 2"));
        n.add(new Player("Player 3"));
        n.add(new Player("Player 4"));
    }

    public void takeTurn(BoardPanel boardPanel) {
        Player player = n.get(currentPlayer);
        int roll = (int)(Math.random() * 6 + 1) + (int)(Math.random() * 6 + 1);
        player.move(roll, 40);
        Tile landedTile = board.getTile(player.getPosition());


        System.out.println(player.getName() + " rolled " + roll + " and landed on " + landedTile.getName());

        if (landedTile instanceof PropertyTile) {
            PropertyTile property = (PropertyTile) landedTile;
            if ( landedTile instanceof Utilities){
                ((Utilities) landedTile).landOn(player);
            } else if (landedTile instanceof RailroadTile) {
                ((RailroadTile) landedTile).landOn(player);
            }

            if (property.getOwner() == null) {
                int choice = JOptionPane.showConfirmDialog(null,
                        player.getName() + " balance remaining: " + player.getMoney()+ ", do you want to buy " + property.getName() + " for $" + property.getPrice() + "?",
                        "Property Purchase", JOptionPane.YES_NO_OPTION);

                if (choice == JOptionPane.YES_OPTION && player.getMoney() >= property.getPrice()) {
                    player.addMoney(-property.getPrice());
                    property.setOwner(player);
                    player.addProperty(property);
                    JOptionPane.showMessageDialog(null, player.getName() + " bought " + property.getName());
                } else {
                    JOptionPane.showMessageDialog(null, player.getName() + " did not buy " + property.getName());
                }
            }
        }

        boardPanel.updatePlayerTokens();
        currentPlayer = (currentPlayer + 1) % n.size();
    }
}
