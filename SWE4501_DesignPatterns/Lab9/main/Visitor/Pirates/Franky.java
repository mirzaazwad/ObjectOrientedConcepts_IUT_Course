package Lab9.Visitor.Pirates;

import Lab9.Visitor.PirateAttack.IVisitorStrawHats;

public class Franky implements IStrawHats{
    private String weapon;
    private Integer bounty;
    private String additional_ability;
    public Franky(String weapon,Integer bounty,String additional_ability){
        this.weapon=weapon;
        this.bounty=bounty;
        this.additional_ability=additional_ability;
    }

    public String special_move(){
        return "Franky Radical Beam";
    }
    public String melee_attack(){
        return "Punch";
    }
    public String accept(IVisitorStrawHats visitor){
        return visitor.visitFranky(this);
    }
    public Integer getBounty(){
        return this.bounty;
    }
}
