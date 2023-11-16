package Lab9.State.MartialArts;

import Lab9.State.Players.IPlayer;

public class TaeKwonDo extends MartialArtsState{
    public TaeKwonDo(IPlayer player){
        super(player);
    }

    public String onSwitchMartialArts1(){
        this.player.setState(new Kenpo(player));
        return "Switching to Kenpo";
    }
    public String onSwitchMartialArts2(){
        this.player.setState(new TaeKwonDo(player));
        return "Continue using Tae Kwon Do";

    }
    public String onSwitchWeaponsMartialArts(){
        this.player.setState(new KaliSticks(player));
        return "Switching to Kali Sticks";
    }

    @Override
    public String toString(){
        return "Tae Kwon Do";
    }
}
