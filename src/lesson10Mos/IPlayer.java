package lesson10Mos;

public interface IPlayer {

    void addCardToHand(Card card);

    boolean needsCard();


    void openHand();

    void setName(String name);
}
