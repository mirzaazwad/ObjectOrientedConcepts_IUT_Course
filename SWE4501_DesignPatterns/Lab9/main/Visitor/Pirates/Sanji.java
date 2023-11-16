package Lab9.Visitor.Pirates;

import Lab9.Visitor.PirateAttack.IVisitorStrawHats;

public class Sanji implements IStrawHats{
    private String weapon;
    private Integer bounty;
    private String additional_skill;
    public Sanji(String weapon,Integer bounty,String additional_skill){
        this.weapon=weapon;
        this.bounty=bounty;
        this.additional_skill=additional_skill;
    }

    public String special_move(){
        return "Diable Jambe: Flambage Shot";
    }
    public String melee_attack(){
        return "kick";
    }
    public String accept(IVisitorStrawHats visitor){
        return visitor.visitSanji(this);
    }
    public Integer getBounty(){
        return this.bounty;
    }
    public String getAdditional_skill(){
        return this.additional_skill;
    }
}
