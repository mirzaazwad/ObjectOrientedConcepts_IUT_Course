package Lab9.Visitor.Pirates;

import Lab9.Visitor.PirateAttack.IVisitorStrawHats;

public class Chopper implements IStrawHats{
    private String weapon;
    private Integer bounty;
    private String additional_ability;
    public Chopper(String weapon,Integer bounty,String additional_ability){
        this.weapon=weapon;
        this.bounty=bounty;
        this.additional_ability=additional_ability;
    }

    public String special_move(){
        return "Monster Point";
    }
    public String melee_attack(){
        return "Punch";
    }
    public String accept(IVisitorStrawHats visitor){
        return visitor.visitChopper(this);
    }
    public String getAdditional_ability(){
        return this.additional_ability;
    }
    public Integer getBounty(){
        return this.bounty;
    }
}
