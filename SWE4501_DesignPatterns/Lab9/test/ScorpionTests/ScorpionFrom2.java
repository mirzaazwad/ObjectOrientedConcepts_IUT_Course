package Lab9.State.ScorpionTests;

import Lab9.State.Players.IPlayer;
import Lab9.State.Players.Scorpion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScorpionFrom2 {
    private IPlayer player;
    @BeforeEach
    public void init(){
        this.player=new Scorpion();
        this.player.getState().onSwitchMartialArts2();
    }

    @Test
    public void testSwitch2to2(){
        String state=this.player.getState().onSwitchMartialArts2();
        assertEquals(state,"Continue using Moi Fah");
        assertEquals(this.player.getState().toString(),"Moi Fah");
    }

    @Test
    public void testSwitch2to1(){
        String state=this.player.getState().onSwitchMartialArts1();
        assertEquals(state,"Switching to Hapikdo");
        assertEquals(this.player.getState().toString(),"Hapikdo");
    }

    @Test
    public void testSwitch2o3(){
        String state=this.player.getState().onSwitchWeaponsMartialArts();
        assertEquals(state,"Switching to Mugai Ryu");
        assertEquals(this.player.getState().toString(),"Mugai Ryu");
    }
}
