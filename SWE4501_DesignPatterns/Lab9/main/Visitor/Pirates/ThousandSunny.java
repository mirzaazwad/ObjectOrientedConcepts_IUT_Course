package Lab9.Visitor.Pirates;

import Lab9.Visitor.PirateAttack.IVisitorStrawHats;

public class ThousandSunny implements IStrawHats{
    private String weapon;
    private Integer bounty;
    private String additional_skill;
    public ThousandSunny(String weapon,Integer bounty,String additional_skill){
        this.weapon=weapon;
        this.bounty=bounty;
        this.additional_skill=additional_skill;
    }

    public String special_move(){
        return "Coup de Burst";
    }
    public String melee_attack(){
        return "canon blast";
    }
    public String accept(IVisitorStrawHats visitor){
        return visitor.visitThousandSunny(this);
    }
    public Integer getBounty(){
        return this.bounty;
    }
    public String getAdditionalAbility(){
        return this.additional_skill;
    }
}
