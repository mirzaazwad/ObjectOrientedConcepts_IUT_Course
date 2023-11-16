package Lab9.State.Players;

import Lab9.State.MartialArts.JeetKunDo;
import Lab9.State.MartialArts.MartialArtsState;

public class JohnnyCage implements IPlayer{
    private MartialArtsState state;
    public JohnnyCage(){
        this.state= new JeetKunDo(this);
    }
    public void setState(MartialArtsState state){
        this.state=state;
    }

    public MartialArtsState getState(){
        return this.state;
    }
}
