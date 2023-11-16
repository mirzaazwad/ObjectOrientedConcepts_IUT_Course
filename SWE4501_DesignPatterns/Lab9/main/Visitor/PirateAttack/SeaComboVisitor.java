package Lab9.Visitor.PirateAttack;

import Lab9.Visitor.Pirates.*;

public class SeaComboVisitor implements IVisitorStrawHats{
    public String getCombo(IStrawHats... args){
        StringBuilder sb = new StringBuilder();
        for (IStrawHats shape : args) {
            sb.append(shape.accept(this)).append("\n");
        }
        return sb.toString();
    }

    public String  visitBrooks(Brooks brooks){
        return brooks.getAdditional_ability();
    }
    public String  visitZorro(Zorro zorro){
        return "Zorro's Attitude: "+zorro.melee_attack();
    }
    public String  visitChopper(Chopper chopper){
        return chopper.getAdditional_ability();
    }
    public String  visitFranky(Franky franky){
        return franky.melee_attack();
    }
    public String  visitNami(Nami nami){
        return nami.getAdditional_skill();
    }
    public String  visitRobin(Robin robin){
        return robin.special_move();
    }
    public String  visitUsopp(Usopp usopp){
        return String.format("Cry over bounty %s",usopp.getBounty());
    }
    public String  visitJimbei(Jimbei jimbei){
        return jimbei.melee_attack();
    }
    public String  visitSanji(Sanji sanji){
        return sanji.special_move();
    }
    public String  visitThousandSunny(ThousandSunny thousandSunny){
        return thousandSunny.getAdditionalAbility();
    }
    public String  visitStawHatPirates(StrawHatPirates strawHatPirates){
        String summary="";
        for (IStrawHats strawHats:strawHatPirates.strawHatsList) {
            summary+="======="+strawHats.getClass().getSimpleName()+"=============="+"\n";
            summary+="Special: "+strawHats.special_move()+"\n";
            summary+="Melee: "+strawHats.melee_attack()+"\n";
        }
        summary+="Total Bounty: "+strawHatPirates.getBounty();
        return summary;
    }
    public String  visitLuffy(Luffy luffy){
        return "Luffy First Move: "+luffy.melee_attack();
    }
}
