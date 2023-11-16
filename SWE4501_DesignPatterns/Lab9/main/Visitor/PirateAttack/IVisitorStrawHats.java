package Lab9.Visitor.PirateAttack;

import Lab9.Visitor.Pirates.*;

public interface IVisitorStrawHats {
    String visitBrooks(Brooks brooks);
    String visitZorro(Zorro zorro);
    String visitChopper(Chopper chopper);
    String visitFranky(Franky franky);
    String visitNami(Nami nami);
    String visitRobin(Robin robin);
    String visitUsopp(Usopp usopp);
    String visitJimbei(Jimbei jimbei);
    String visitSanji(Sanji sanji);
    String visitThousandSunny(ThousandSunny thousandSunny);
    String visitStawHatPirates(StrawHatPirates strawHatPirates);
    String visitLuffy(Luffy luffy);
}
