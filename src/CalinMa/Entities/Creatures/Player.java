package CalinMa.Entities.Creatures;

import CalinMa.Gfx.Animation;
import CalinMa.Gfx.Assets;
import CalinMa.Handler;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player extends Creature {
    //Animations
    private Animation animDown, animUp, animLeft, animRight;

    public Player(Handler handler, float x, float y) {

        super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);

        bounds.x = 5;
        bounds.y = 12;
        bounds.width = 32;
        bounds.height = 15;
        //Animations
        animDown = new Animation(500, Assets.player_down);
        animUp = new Animation(500, Assets.player_up);
        animLeft = new Animation(500, Assets.player_left);
        animRight = new Animation(500, Assets.player_right);
    }
    @Override
    public void tick() {
        //animations
        animDown.tick();
        animUp.tick();
        animLeft.tick();
        animRight.tick();
        //movement
        getInput();
        move();
        handler.getGameCamera().centerOnEntity(this);
    }
    private void getInput(){
        xMove = 0;
        yMove = 0;

        if(handler.getKeyManager().up)
            yMove = -speed;
        if(handler.getKeyManager().down)
            yMove = speed;
        if(handler.getKeyManager().left)
            xMove = -speed;
        if(handler.getKeyManager().right)
            xMove = speed;
    }
    @Override
    public void render(Graphics g) {
        g.drawImage(getCurrentAnimationFrame(), (int)(x - handler.getGameCamera().getxOffset()) ,
                (int)(y - handler.getGameCamera().getyOffset()), width, height,  null);
    }
private BufferedImage getCurrentAnimationFrame(){
        if(xMove < 0){
            return animLeft.getCurrentFrame();
            } else if(xMove > 0 ){
            return animRight.getCurrentFrame();
        } else if (yMove < 0){
            return animUp.getCurrentFrame();
        } else {
            return animDown.getCurrentFrame();
        }
}
}
