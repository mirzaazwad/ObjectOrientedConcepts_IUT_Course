package Lab9.State.MartialArts;

import Lab9.State.Players.IPlayer;
import Lab9.State.Players.SubZero;

public class MoiFah extends MartialArtsState{
    public MoiFah(IPlayer player){
        super(player);
    }

    public String onSwitchMartialArts1(){
        this.player.setState(new Hapikdo(player));
        return "Switching to Hapikdo";
    }
    public String onSwitchMartialArts2(){
        this.player.setState(new MoiFah(player));
        return "Continue using Moi Fah";
    }
    public String onSwitchWeaponsMartialArts(){
        this.player.setState(new MugaiRyu(player));
        return "Switching to Mugai Ryu";
    }

    @Override
    public String toString(){
        return "Moi Fah";
    }
}
