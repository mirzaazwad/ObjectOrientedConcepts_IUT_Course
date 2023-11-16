package Lab9.State.Players;


import Lab9.State.MartialArts.Kenpo;
import Lab9.State.MartialArts.MartialArtsState;

public class SonyaBlade implements IPlayer{
    private MartialArtsState state;
    public SonyaBlade(){
        this.state=new Kenpo(this);
    }
    public void setState(MartialArtsState state){
        this.state=state;
    }
    public MartialArtsState getState(){
        return this.state;
    }
}