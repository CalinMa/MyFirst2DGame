package CalinMa.States;

import CalinMa.Handler;

import java.awt.*;

public abstract class State {

    private static State currentState =  null ;

    public State(Handler handler) {
        this.handler = handler;
    }

    public static void setState(State state){
        currentState = state;
    }
    public static State getState(){
        return currentState;
    }
    //Class
    protected Handler handler;
   /* public State(Handler handler){
        this.handler = handler;
    }*/
    public abstract void tick();
    public abstract void render(Graphics g);
}
