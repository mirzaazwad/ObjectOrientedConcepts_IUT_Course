package Lab9.State.MartialArts;

import Lab9.State.Players.IPlayer;
import Lab9.State.Players.SubZero;

public class Dragon extends MartialArtsState{
    public Dragon(IPlayer player){
        super(player);
    }

    public String onSwitchMartialArts1(){
        this.player.setState(new Shotokan(player));
        return "Switching to Shotokan";
    }
    public String onSwitchMartialArts2(){
        this.player.setState(new Dragon(player));
        return "Continue using Dragon";

    }
    public String onSwitchWeaponsMartialArts(){
        this.player.setState(new KoriBlade(player));
        return "Switching to Kori Blade";
    }

    @Override
    public String toString(){
        return "Dragon";
    }
}
