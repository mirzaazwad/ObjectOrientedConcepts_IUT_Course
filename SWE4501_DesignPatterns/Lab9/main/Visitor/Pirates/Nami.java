package Lab9.Visitor.Pirates;

import Lab9.Visitor.PirateAttack.IVisitorStrawHats;

public class Nami implements IStrawHats{
    private String weapon;
    private Integer bounty;
    private String additional_skill;
    public Nami(String weapon,Integer bounty,String additional_skill){
        this.weapon=weapon;
        this.bounty=bounty;
        this.additional_skill=additional_skill;
    }

    public String special_move(){
        return "Lightning Blast";
    }
    public String melee_attack(){
        return "Clima-Tact Hit";
    }
    public String accept(IVisitorStrawHats visitor){
        return visitor.visitNami(this);
    }
    public Integer getBounty(){
        return this.bounty;
    }

    public String getAdditional_skill(){
        return this.additional_skill;
    }
}
