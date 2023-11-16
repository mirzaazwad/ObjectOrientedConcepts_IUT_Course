package Lab9.State.JohnnyCageTests;

import Lab9.State.Players.IPlayer;
import Lab9.State.Players.JohnnyCage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JohnnyCageFrom3 {
    private IPlayer player;
    @BeforeEach
    public void init(){
        this.player=new JohnnyCage();
        this.player.getState().onSwitchWeaponsMartialArts();
    }

    @Test
    public void testSwitch3to2(){
        String state=this.player.getState().onSwitchMartialArts2();
        assertEquals(state,"Switching to Shinto Ryu");
        assertEquals(this.player.getState().toString(),"Shinto Ryu");
    }

    @Test
    public void testSwitch3to1(){
        String state=this.player.getState().onSwitchMartialArts1();
        assertEquals(state,"Switching to Jeet Kun Do");
        assertEquals(this.player.getState().toString(),"Jeet Kun Do");
    }

    @Test
    public void testSwitch3to3(){
        String state=this.player.getState().onSwitchWeaponsMartialArts();
        assertEquals(state,"Continue using Nunchaku");
        assertEquals(this.player.getState().toString(),"Nunchaku");
    }
}
