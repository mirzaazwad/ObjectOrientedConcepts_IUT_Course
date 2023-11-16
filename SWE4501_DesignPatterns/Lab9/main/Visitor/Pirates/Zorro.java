package Lab9.Visitor.Pirates;

import Lab9.Visitor.PirateAttack.IVisitorStrawHats;

public class Zorro implements IStrawHats{
    private String weapon;
    private Integer bounty;
    public Zorro(String weapon,Integer bounty){
        this.weapon=weapon;
        this.bounty=bounty;
    }

    public String special_move(){
        return "Three-Sword Style Secret Move: The Billion-Fold World: Trichiliocosm";
    }
    public String melee_attack(){
        return "Slice";
    }
    public String accept(IVisitorStrawHats visitor){
        return visitor.visitZorro(this);
    }
    public Integer getBounty(){
        return this.bounty;
    }
}
