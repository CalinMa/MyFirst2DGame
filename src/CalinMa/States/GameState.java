package CalinMa.States;
import CalinMa.Entities.Creatures.Player;
import CalinMa.Handler;
import CalinMa.worlds.World;

import java.awt.*;

public class  GameState extends State {
    private Player player;
    private World world;


    public GameState(Handler handler){
        super(handler);
        world = new World(handler,"C:\\Users\\LEGION\\Downloads\\PrimulMeuJoc\\Res\\worlds\\world1.txt"); // file for building the map
        handler.setWorld(world);
        player = new Player(handler,100,100); // new player and its size
    }
    @Override
    public void tick() {
        world.tick();
    }
    @Override
    public void render(Graphics g) {
       world.render(g);
    }
}
