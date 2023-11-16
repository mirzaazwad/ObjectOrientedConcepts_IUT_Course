package Lab9.Visitor.Pirates;

import Lab9.Visitor.PirateAttack.IVisitorStrawHats;

public class Brooks implements IStrawHats{
    private String weapon;
    private Integer bounty;
    private String additional_ability;
    public Brooks(String weapon,Integer bounty,String additional_ability){
        this.weapon=weapon;
        this.bounty=bounty;
        this.additional_ability=additional_ability;
    }

    public String special_move(){
        return "Song Of Scratches: Blizard Slice";
    }
    public String melee_attack(){
        return "Slice";
    }
    public String accept(IVisitorStrawHats visitor){
        return visitor.visitBrooks(this);
    }

    public Integer getBounty(){
        return this.bounty;
    }

    public String getAdditional_ability(){
        return this.additional_ability;
    }
}
