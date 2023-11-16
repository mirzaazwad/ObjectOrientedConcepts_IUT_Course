package Lab9.Visitor;

import Lab9.Visitor.PirateAttack.SeaComboVisitor;
import Lab9.Visitor.Pirates.*;

import java.util.ArrayList;
import java.util.List;

public class PirateGame {
    public static void main(String[] args) {
        Chopper chopper=new Chopper("hands",1000,"heal");
        Nami nami=new Nami("clima-takt",366000000,"Navigate");
        Brooks brooks=new Brooks("sword",383000000,"sing");
        Franky franky=new Franky("canon",394000000,"fix ship");
        Usopp usopp=new Usopp("sling-shot",500000000,"make weapon");
        Robin robin=new Robin("hands",930000000,"study archaeological sites");
        Sanji sanji=new Sanji("legs",1032000000,"cook");
        Jimbei jimbei=new Jimbei("hands",1100000000,"manuever ship","fish-man");
        Zorro zorro=new Zorro("three swords",1111000000);
        Luffy luffy=new Luffy("iron-rubber body",300000000,"captain");
        ThousandSunny thousandSunny=new ThousandSunny("canon",0,"sail");
        List<IStrawHats> strawHatsList=new ArrayList<IStrawHats>();
        strawHatsList.add(nami);
        strawHatsList.add(chopper);
        strawHatsList.add(franky);
        strawHatsList.add(usopp);
        strawHatsList.add(thousandSunny);
        strawHatsList.add(sanji);
        strawHatsList.add(jimbei);
        strawHatsList.add(robin);
        strawHatsList.add(brooks);
        StrawHatPirates strawHatPirates=new StrawHatPirates("yonko",strawHatsList);
        getCombo(luffy,zorro,strawHatPirates);
    }

    public static void getCombo(IStrawHats... strawHats){
        SeaComboVisitor seaComboVisitor=new SeaComboVisitor();
        System.out.println("Battle Summary\n"+seaComboVisitor.getCombo(strawHats));
    }
}
