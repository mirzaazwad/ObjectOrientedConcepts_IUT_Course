package Lab9.State.MartialArts;

import Lab9.State.Players.IPlayer;

public abstract class MartialArtsState {
    protected IPlayer player;
    public MartialArtsState(IPlayer player){
        this.player=player;
    }

    public abstract String onSwitchMartialArts1();
    public abstract String onSwitchMartialArts2();
    public abstract String onSwitchWeaponsMartialArts();
}
