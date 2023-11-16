package Lab9.State.JohnnyCageTests;

import Lab9.State.Players.IPlayer;
import Lab9.State.Players.JohnnyCage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JohnnyCageFrom1 {
    private IPlayer player;
    @BeforeEach
    public void init(){
        this.player=new JohnnyCage();
    }

    @Test
    public void testSwitch1to2(){
        String state=this.player.getState().onSwitchMartialArts2();
        assertEquals(state,"Switching to Shinto Ryu");
        assertEquals(this.player.getState().toString(),"Shinto Ryu");
    }

    @Test
    public void testSwitch1to1(){
        String state=this.player.getState().onSwitchMartialArts1();
        assertEquals(state,"Continue using Jeet Kun Do");
        assertEquals(this.player.getState().toString(),"Jeet Kun Do");
    }

    @Test
    public void testSwitch1to3(){
        String state=this.player.getState().onSwitchWeaponsMartialArts();
        assertEquals(state,"Switching to Nunchaku");
        assertEquals(this.player.getState().toString(),"Nunchaku");
    }
}
