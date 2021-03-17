package CalinMa.Tiles;

import java.awt.*;
import java.awt.image.BufferedImage;
// The tiles that will build the map
// You can see and change the game map in Res/worlds/world1.txt
public class Tile {
    //Static Stuff Here
    public static Tile[] tiles = new Tile[256];
    public static Tile grassTile = new GrassTile(0);
    public static Tile dirtTile = new DirtTile (1);
    public static Tile rockTile = new RockTile(2);
    //Class
    public static final int TILEWIDTH = 40, TILEHEIGHT = 40;
    protected BufferedImage texture;
    protected final int id;

    public Tile(BufferedImage texture, int id){
        this.texture = texture;
        this.id = id;
        tiles[id] = this;
    }

    public void tick(){
    }
    public void render(Graphics g, int x, int y){
        g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null );
    }
    public boolean isSolid(){
        return false;
    }

    public int getId(){
        return id;
    }
}
