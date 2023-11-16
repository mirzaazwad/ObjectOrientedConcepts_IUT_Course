package Lab9.State.MartialArts;

import Lab9.State.Players.IPlayer;

public class ShintoRyu extends MartialArtsState{
    public ShintoRyu(IPlayer player){
        super(player);
    }

    public String onSwitchMartialArts1(){
        this.player.setState(new JeetKunDo(player));
        return "Switching to Jeet Kun Do";
    }
    public String onSwitchMartialArts2(){
        this.player.setState(new ShintoRyu(player));
        return "Continue using Shinto Ryu";

    }
    public String onSwitchWeaponsMartialArts(){
        this.player.setState(new Nunchaku(player));
        return "Switching to Nunchaku";
    }

    @Override
    public String toString(){
        return "Shinto Ryu";
    }
}