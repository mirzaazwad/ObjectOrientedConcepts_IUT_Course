package Lab9.State.Players;

import Lab9.State.MartialArts.MartialArtsState;

public interface IPlayer {
    void setState(MartialArtsState state);
    MartialArtsState getState();
}
