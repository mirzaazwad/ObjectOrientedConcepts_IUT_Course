package Lab9.State.MartialArts;

import Lab9.State.Players.IPlayer;

public class KoriBlade extends MartialArtsState{
    public KoriBlade(IPlayer player){
        super(player);
    }

    public String onSwitchMartialArts1(){
        this.player.setState(new Shotokan(player));
        return "Switching to Shotokan";
    }
    public String onSwitchMartialArts2(){
        this.player.setState(new Dragon(player));
        return "Switching to Dragon";

    }
    public String onSwitchWeaponsMartialArts(){
        this.player.setState(new KoriBlade(player));
        return "Continue using Kori Blade";
    }

    @Override
    public String toString(){
        return "Kori Blade";
    }
}
