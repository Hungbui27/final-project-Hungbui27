import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BoardPanel extends JPanel {
    private Board board;
    private ArrayList<Player> players;
    private JPanel[] tilePanels;

    public BoardPanel(Board board, ArrayList<Player> players) {
        this.board = board;
        this.players = players;
        setLayout(new GridLayout(11, 11));
        tilePanels = new JPanel[40];
        drawBoard();
    }

    private void drawBoard() {
        for (int row = 0; row < 11; row++) {
            for (int col = 0; col < 11; col++) {
                if (isBoardEdge(row, col)) {
                    int tileIndex = mapGridPositionToTileIndex(row, col);
                    Tile tile = board.getTile(tileIndex);
                    JPanel panel = createTilePanel(tileIndex, tile);
                    tilePanels[tileIndex] = panel;
                    add(panel);
                } else {
                    add(new JPanel());
                }
            }
        }
    }

    private boolean isBoardEdge(int row, int col) {
        return row == 0 || row == 10 || col == 0 || col == 10;
    }

    private int mapGridPositionToTileIndex(int row, int col) {
        if (row == 10) return col;
        if (col == 10) return 10 + (10 - row);
        if (row == 0) return 20 + (10 - col);
        if (col == 0) return 30 + row;
        return -1;
    }

    private JPanel createTilePanel(int index, Tile tile) {
        Color Monopoly = new Color(191, 219, 174);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.setBackground(Monopoly);
        panel.setPreferredSize(new Dimension(80, 60));
        panel.add(new JLabel(tile.getName()));

        if (tile instanceof PropertyTile) {
            panel.add(new JLabel("$" + tile.getPrice()));
        }

        return panel;
    }

    public void updatePlayerTokens() {
        for (int i = 0; i < 40; i++) {
            tilePanels[i].removeAll();
            Tile tile = board.getTile(i);
            tilePanels[i].add(new JLabel(tile.getName()));
            if (tile instanceof PropertyTile) {
                tilePanels[i].add(new JLabel("$" + tile.getPrice()));
            }

            for (Player player : players) {
                if (player.getPosition() == i) {
                    tilePanels[i].add(new JLabel(player.getName()));
                }
            }
            tilePanels[i].revalidate();
            tilePanels[i].repaint();
        }
    }
}