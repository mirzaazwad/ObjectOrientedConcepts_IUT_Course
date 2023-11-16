package Lab9.State.Players;

import Lab9.State.MartialArts.Hapikdo;
import Lab9.State.MartialArts.MartialArtsState;


public class Scorpion implements IPlayer{
    private MartialArtsState state;
    public Scorpion(){
        this.state=new Hapikdo(this);
    }
    public void setState(MartialArtsState state){
        this.state=state;
    }
    public MartialArtsState getState(){
        return this.state;
    }
}
