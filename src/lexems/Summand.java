package lexems;

public class Summand implements ILexem {
    public ILexem s;

    public Summand(ILexem primary) {
        s = primary;
    }
}
