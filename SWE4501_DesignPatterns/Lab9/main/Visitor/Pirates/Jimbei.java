package Lab9.Visitor.Pirates;

import Lab9.Visitor.PirateAttack.IVisitorStrawHats;

public class Jimbei implements IStrawHats{
    private String weapon;
    private Integer bounty;
    private String additional_ability;
    private String race;
    public Jimbei(String weapon,Integer bounty,String additional_ability,String race){
        this.weapon=weapon;
        this.bounty=bounty;
        this.additional_ability=additional_ability;
        this.race=race;
    }

    public String special_move(){
        return "Fish-Man Karate Hidden Technique - Vagabond Drill";
    }
    public String melee_attack(){
        return "Punch";
    }
    public String accept(IVisitorStrawHats visitor){
        return visitor.visitJimbei(this);
    }
    public Integer getBounty(){
        return this.bounty;
    }
}
