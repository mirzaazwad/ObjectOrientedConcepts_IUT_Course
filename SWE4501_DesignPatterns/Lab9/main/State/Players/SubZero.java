package Lab9.State.Players;

import Lab9.State.MartialArts.MartialArtsState;
import Lab9.State.MartialArts.Shotokan;

public class SubZero implements IPlayer {
    private MartialArtsState state;
    public SubZero(){
        this.state=new Shotokan(this);
    }
    public void setState(MartialArtsState state){
        this.state=state;
    }
    public MartialArtsState getState(){
        return this.state;
    }
}
