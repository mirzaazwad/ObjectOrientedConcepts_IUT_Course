package Lab9.State.SonyaBladeTests;

import Lab9.State.Players.IPlayer;
import Lab9.State.Players.SonyaBlade;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SonyaBladeFrom2 {
    private IPlayer player;
    @BeforeEach
    public void init(){
        this.player=new SonyaBlade();
        this.player.getState().onSwitchMartialArts2();
    }

    @Test
    public void testSwitch2to2(){
        String state=this.player.getState().onSwitchMartialArts2();
        assertEquals(state,"Continue using Tae Kwon Do");
        assertEquals(this.player.getState().toString(),"Tae Kwon Do");
    }

    @Test
    public void testSwitch2to1(){
        String state=this.player.getState().onSwitchMartialArts1();
        assertEquals(state,"Switching to Kenpo");
        assertEquals(this.player.getState().toString(),"Kenpo");
    }

    @Test
    public void testSwitch2o3(){
        String state=this.player.getState().onSwitchWeaponsMartialArts();
        assertEquals(state,"Switching to Kali Sticks");
        assertEquals(this.player.getState().toString(),"Kali Sticks");
    }
}
