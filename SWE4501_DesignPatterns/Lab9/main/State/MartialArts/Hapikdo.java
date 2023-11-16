package Lab9.State.MartialArts;

import Lab9.State.Players.IPlayer;

public class Hapikdo extends MartialArtsState{
    public Hapikdo(IPlayer player){
        super(player);
    }

    public String onSwitchMartialArts1(){
        this.player.setState(new Hapikdo(player));
        return "Continue using Hapikdo";
    }
    public String onSwitchMartialArts2(){
        this.player.setState(new MoiFah(player));
        return "Switching to Moi Fah";
    }
    public String onSwitchWeaponsMartialArts(){
        this.player.setState(new MugaiRyu(player));
        return "Switching to Mugai Ryu";
    }
    @Override
    public String toString(){
        return "Hapikdo";
    }
}
