import java.util.ArrayList;
import java.util.List;

public class Board {
    private Tile[] tiles;


    public Board() {
        tiles = new Tile[40];
        initializeTiles();

    }

    private void initializeTiles() {
        tiles[0] = new Tile("GO", 0);
        tiles[1] = new PropertyTile("Mediterranean Avenue", 60, 2);
        tiles[2] = new Tile("Community Chest", 0);
        tiles[3] = new PropertyTile("Baltic Avenue", 60, 4);
        tiles[4] = new Tile("Income Tax", 0);
        tiles[5] = new RailroadTile("Reading Railroad", 200, 0 );
        tiles[6] = new PropertyTile("Oriental Avenue", 100, 6);
        tiles[7] = new Tile("Chances", 0);
        tiles[8] = new PropertyTile("Vermont Avenue", 100, 6);
        tiles[9] = new PropertyTile("Connecticut Avenue", 120, 8);
        tiles[10] = new Tile("Jail/Just Visiting", 0);
        tiles[11] = new PropertyTile("St. Charles Place", 140, 10);
        tiles[12] = new Utilities("Electric Company", 150, 0);
        tiles[13] = new PropertyTile("States Avenue", 140, 10);
        tiles[14] = new PropertyTile("Virginia Avenue", 160, 12);
        tiles[15] = new RailroadTile("Pennsylvania Railroad", 200, 0);
        tiles[16] = new PropertyTile("St. James Place", 180, 14);
        tiles[17] = new Tile("Community Chest", 0);
        tiles[18] = new PropertyTile("Tennessee Avenue", 180, 14);
        tiles[19] = new PropertyTile("New York Avenue", 200, 16);
        tiles[20] = new Tile("Free Parking", 0);
        tiles[21] = new PropertyTile("Kentucky Avenue", 220, 18);
        tiles[22] = new Tile("Chances", 0);
        tiles[23] = new PropertyTile("Indiana Avenue", 220, 18);
        tiles[24] = new PropertyTile("Illinois Avenue", 240, 20);
        tiles[25] = new RailroadTile("B. & O. Railroad", 200, 0);
        tiles[26] = new PropertyTile("Atlantic Avenue", 260, 22);
        tiles[27] = new PropertyTile("Ventnor Avenue", 260,22);
        tiles[28] = new Utilities("Water Works", 150, 0);
        tiles[29] = new PropertyTile("Marvin Gardens", 280,24);
        tiles[30] = new Tile("Go to Jail", 0);
        tiles[31] = new PropertyTile("Pacific Avenue", 300, 26);
        tiles[32] = new PropertyTile("North Carolina Avenue", 300, 26);
        tiles[33] = new Tile("Community Chest", 0);
        tiles[34] = new PropertyTile("Pennsylvania Avenue", 320, 28);
        tiles[35] = new RailroadTile("Short Line", 200, 0);
        tiles[36] = new Tile("Chances", 0);
        tiles[37] = new PropertyTile("Park Place", 350, 35);
        tiles[38] = new Tile("Luxury Tax", 0);
        tiles[39] = new PropertyTile("Boardwalk", 400, 50);

        // ... add other tiles up to tiles[39]

    }
    public Tile getTile(int index) {
        return tiles[index];
    }

    public Tile[] getAllTiles() {
        return tiles;
    }

}

