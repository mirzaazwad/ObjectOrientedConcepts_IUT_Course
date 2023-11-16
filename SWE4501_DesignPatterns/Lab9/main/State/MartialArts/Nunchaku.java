package Lab9.State.MartialArts;

import Lab9.State.Players.IPlayer;

public class Nunchaku  extends MartialArtsState{
    public Nunchaku(IPlayer player){
        super(player);
    }

    public String onSwitchMartialArts1(){
        this.player.setState(new JeetKunDo(player));
        return "Switching to Jeet Kun Do";
    }
    public String onSwitchMartialArts2(){
        this.player.setState(new ShintoRyu(player));
        return "Switching to Shinto Ryu";

    }
    public String onSwitchWeaponsMartialArts(){
        this.player.setState(new Nunchaku(player));
        return "Continue using Nunchaku";
    }

    @Override
    public String toString(){
        return "Nunchaku";
    }
}