package Lab9.Visitor.Pirates;

import Lab9.Visitor.PirateAttack.IVisitorStrawHats;

public class Luffy implements IStrawHats{
    private String weapon;
    private Integer bounty;
    private String rank;
    public Luffy(String weapon,Integer bounty,String rank){
        this.weapon=weapon;
        this.bounty=bounty;
        this.rank=rank;
    }

    public String special_move(){
        return "Gear Fourth: King Kong Gun";
    }
    public String melee_attack(){
        return "Gum Gum Pistol";
    }
    public String accept(IVisitorStrawHats visitor){
        return visitor.visitLuffy(this);
    }
    public Integer getBounty(){
        return this.bounty;
    }
}
