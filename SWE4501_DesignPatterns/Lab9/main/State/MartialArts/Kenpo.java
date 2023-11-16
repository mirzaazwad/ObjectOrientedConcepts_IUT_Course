package Lab9.State.MartialArts;

import Lab9.State.Players.IPlayer;

public class Kenpo  extends MartialArtsState{
    public Kenpo(IPlayer player){
        super(player);
    }

    public String onSwitchMartialArts1(){
        this.player.setState(new Kenpo(player));
        return "Continue using Kenpo";
    }
    public String onSwitchMartialArts2(){
        this.player.setState(new TaeKwonDo(player));
        return "Switching to Tae Kwon Do";
    }
    public String onSwitchWeaponsMartialArts(){
        this.player.setState(new KaliSticks(player));
        return "Switching to Kali Sticks";
    }

    @Override
    public String toString(){
        return "Kenpo";
    }
}
