import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameFrame extends JFrame {
    private Board board;
    private BoardPanel boardPanel;
    private GameController gameController;

    public GameFrame() {
        board = new Board();
        ArrayList<Player> players = new ArrayList<>();
        gameController = new GameController(board, players);
        boardPanel = new BoardPanel(board, players);

        JButton rollButton = new JButton("Roll Dice");
        rollButton.addActionListener(e -> {
            gameController.takeTurn(boardPanel);
        });

        JPanel controlPanel = new JPanel();
        controlPanel.add(rollButton);

        setLayout(new BorderLayout());
        add(boardPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);

        setTitle("Monopoly Game");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GameFrame();
    }
}