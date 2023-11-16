package Lab9.Visitor.Pirates;

import Lab9.Visitor.PirateAttack.IVisitorStrawHats;

public class Robin implements IStrawHats{
    private String weapon;
    private Integer bounty;
    private String additional_skill;
    public Robin(String weapon,Integer bounty,String additional_skill){
        this.weapon=weapon;
        this.bounty=bounty;
        this.additional_skill=additional_skill;
    }

    public String special_move(){
        return "Mil Fleur: Gigantesteco Mano Stamp";
    }
    public String melee_attack(){
        return "Slap";
    }
    public String accept(IVisitorStrawHats visitor){
        return visitor.visitRobin(this);
    }
    public Integer getBounty(){
        return this.bounty;
    }
}
