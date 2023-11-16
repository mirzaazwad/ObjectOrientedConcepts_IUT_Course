package Lab9.State.MartialArts;

import Lab9.State.Players.IPlayer;

public class MugaiRyu extends MartialArtsState{
    public MugaiRyu(IPlayer player){
        super(player);
    }

    public String onSwitchMartialArts1(){
        this.player.setState(new Hapikdo(player));
        return "Switching to Hapikdo";
    }
    public String onSwitchMartialArts2(){
        this.player.setState(new MoiFah(player));
        return "Switching to Moi Fah";

    }
    public String onSwitchWeaponsMartialArts(){
        this.player.setState(new MugaiRyu(player));
        return "Continue using Mugai Ryu";
    }

    @Override
    public String toString(){
        return "Mugai Ryu";
    }
}
