package lesson10Mos;

public class Dealer extends Player{

    @Override
    public boolean needsCard() {
        return valuesHand() < 17;
    }
}
