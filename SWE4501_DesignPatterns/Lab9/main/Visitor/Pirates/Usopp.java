package Lab9.Visitor.Pirates;

import Lab9.Visitor.PirateAttack.IVisitorStrawHats;

public class Usopp implements IStrawHats{
    private String weapon;
    private Integer bounty;
    private String additional_skill;
    public Usopp(String weapon,Integer bounty,String additional_skill){
        this.weapon=weapon;
        this.bounty=bounty;
        this.additional_skill=additional_skill;
    }

    public String special_move(){
        return "Green Star: Impact Wolf";
    }
    public String melee_attack(){
        return "pea bean shot";
    }
    public String accept(IVisitorStrawHats visitor){
        return visitor.visitUsopp(this);
    }
    public Integer getBounty(){
        return this.bounty;
    }
}
