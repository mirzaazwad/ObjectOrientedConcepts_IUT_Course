package Lab9.Visitor.Pirates;

import Lab9.Visitor.PirateAttack.IVisitorStrawHats;

public interface IStrawHats {
    String special_move();
    String melee_attack();
    String accept(IVisitorStrawHats visitor);
    Integer getBounty();
}
