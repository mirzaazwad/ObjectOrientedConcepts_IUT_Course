package Lab9.Visitor.Pirates;

import Lab9.Visitor.PirateAttack.IVisitorStrawHats;

import java.util.ArrayList;
import java.util.List;

public class StrawHatPirates implements IStrawHats{
    private Integer bounty;
    private String rank;
    public List<IStrawHats> strawHatsList;
    public StrawHatPirates(String rank, List<IStrawHats> strawHatsList){
        this.rank=rank;
        this.strawHatsList=strawHatsList;
        this.bounty=0;
        for (IStrawHats strawHats:strawHatsList) {
            this.bounty+=strawHats.getBounty();
        }
    }

    public String special_move(){
        String special="";
        for (IStrawHats strawHats:strawHatsList) {
            special+=strawHats.special_move()+"\n";
        }

        return special;
    }
    public String melee_attack(){
        String melee="";
        for (IStrawHats strawHats:strawHatsList) {
            melee+=strawHats.melee_attack()+"\n";
        }

        return melee;
    }
    public String accept(IVisitorStrawHats visitor){
        return visitor.visitStawHatPirates(this);
    }

    public Integer getBounty(){
        return this.bounty;
    }
}
